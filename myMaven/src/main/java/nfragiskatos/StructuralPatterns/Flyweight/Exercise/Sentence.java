package nfragiskatos.StructuralPatterns.Flyweight.Exercise;

import java.util.*;

public class Sentence {
    private String plainText;
    private List<String> words = new ArrayList<>();
    private Map<Integer, WordToken> tokens = new HashMap<>();

    public Sentence(String plainText) {
        this.plainText = plainText;
        Collections.addAll(words, plainText.split(" "));
    }

    public WordToken getWord(int index) {
        WordToken wordToken = new WordToken();
        tokens.put(index, wordToken);
        return wordToken;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.size(); ++i) {
            WordToken token = tokens.get(i);
            sb.append(token != null && token.capitalize ? words.get(i).toUpperCase() : words.get(i)).append(i != words.size() - 1 ? " ": "");
        }
        return sb.toString();
    }

    class WordToken {
        public boolean capitalize;
    }
}
