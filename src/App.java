import application.services.ChatbotService;

public class App {
    public static void main(String[] args) throws Exception {
        ChatbotService chatbotService = new ChatbotService();

        chatbotService.startConversation();
    }
}
