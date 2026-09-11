package application.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import application.constants.IntentionTreeSeed;
import application.helpers.TextHelper;
import domain.Chat;
import domain.IntentionTree;
import domain.MessageContext;

public class ChatbotService {
    private IntentionTree intentionTree;
    private BufferedReader reader;
    private List<Chat> chatHistory;

    private static String DEFAULT_START_MESSAGE = "Olá, sou o Nortinho, Assistente virtual do Banco Norte! Como posso te ajudar?";
    private static String DEFAULT_FALLBACK_MESSAGE = "Não entendi o que você quis dizer, poderia solicitar novamente?";
    private static String DEFAULT_AFTER_SUCCESS_MESSAGE = "Posso te ajudar em algo mais?";
    private static List<String> EXIT_WORDS = Arrays.asList("SAIR", "CANCELAR");

    public ChatbotService() {
        this.intentionTree = new IntentionTree();
        this.chatHistory = new ArrayList<Chat>();
        this.reader = new BufferedReader(new InputStreamReader(System.in));

        this.loadIntentionTree();
    }

    private void loadIntentionTree() {
        this.intentionTree.build(IntentionTreeSeed.getSeedTree());
    }

    public void startConversation() throws IOException {
        System.out.println(DEFAULT_START_MESSAGE);
        System.out.println("Para começarmos o nosso atendimento, gostaria que você informasse o seu nome.");
        System.out.print("Usuário: ");

        MessageContext message = processUserInput();
        String username = message.getRaw();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("No que posso te ajudar, " + username + "?");

        while (!userWantsToFinishCurrentConversation(message.getWords())) {
            System.out.print(username + ": ");
            message = processUserInput();
            this.chatHistory.add(new Chat(message.getRaw(), username));

            if (userWantsToFinishCurrentConversation(message.getWords())) {
                continue;
            }

            String response = this.intentionTree.getIntetionResponseByWords(message.getWords());

            if (TextHelper.isNullOrEmpty(response)) {
                System.out.println("");
                System.out.println(DEFAULT_FALLBACK_MESSAGE);
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println(response);
                System.out.println(DEFAULT_AFTER_SUCCESS_MESSAGE);
                System.out.println("");
            }
        }

        System.out.println("Foi um prazer falar contigo, " + username
                + "! Se precisar de algo, é só me chamar novamente, ok? Câmbio, desligo.");
    }

    private MessageContext processUserInput() throws IOException {
        String input = TextHelper.normalize(reader.readLine());
        List<String> words = TextHelper.splitBySpaces(input);

        return new MessageContext(input, words);
    }

    private boolean userWantsToFinishCurrentConversation(List<String> words) {
        boolean userInputContainsAnyExitWord = words.stream().anyMatch(EXIT_WORDS::contains);

        return userInputContainsAnyExitWord;
    }
}
