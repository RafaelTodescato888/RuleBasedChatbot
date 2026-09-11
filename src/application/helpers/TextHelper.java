package application.helpers;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;

public class TextHelper {
    public static String normalize(String input) {
        String normalizedText = Normalizer.normalize(input, Normalizer.Form.NFD);
        String cleaned = normalizedText.replaceAll("[\\p{M}[^a-zA-Z0-9 ]]", "");

        return cleaned.toUpperCase();
    }

    public static List<String> splitBySpaces(String input) {
        return Arrays.asList(input.split(" "));
    }

    public static boolean isNullOrEmpty(String input) {
        return input == null || input.isEmpty();
    }
}
