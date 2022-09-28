import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> words = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] parts = text.split("\\P{IsAlphabetic}+");
        words.addAll(Arrays.asList(parts));
    }

    public boolean HasWord(String qWord) {
        return words.contains(qWord);
    }
}