import java.util.*;

public class HighestResemblanceInDictionary {
    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList(
                "java",
                "javascript",
                "python",
                "ruby",
                "javaee",
                "csharp",
                "php"
        );

        String inputWord = "java";

        List<String> closestWords = findClosestWords(dictionary, inputWord);

        System.out.println("Words with the highest resemblance to '" + inputWord + "':");
        for (String word : closestWords) {
            System.out.println(word);
        }
    }

    private static List<String> findClosestWords(List<String> dictionary, String inputWord) {
        List<String> closestWords = new ArrayList<>();
        double maxSimilarity = 0.0;

        for (String word : dictionary) {
            double similarity = calculateJaccardSimilarity(word, inputWord);

            if (similarity > maxSimilarity) {
                closestWords.clear();
                closestWords.add(word);
                maxSimilarity = similarity;
            } else if (similarity == maxSimilarity) {
                closestWords.add(word);
            }
        }

        return closestWords;
    }

    private static double calculateJaccardSimilarity(String word1, String word2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : word1.toCharArray()) {
            set1.add(c);
        }

        for (char c : word2.toCharArray()) {
            set2.add(c);
        }

        int intersectionSize = 0;
        int unionSize = set1.size() + set2.size();

        for (char c : set1) {
            if (set2.contains(c)) {
                intersectionSize++;
            }
        }

        return (double) intersectionSize / (double) unionSize;
    }
}
