package domain;

import java.util.List;

public class MessageContext {
    private String raw;
    private List<String> words;

    public MessageContext(String raw, List<String> words) {
        this.raw = raw;
        this.words = words;
    }

    public String getRaw() {
        return raw;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}
