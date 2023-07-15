public class RunLengthEncoder {
    public static void main(String[] args) {
        String input = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB";

        String encodedString = runLengthEncode(input);

        System.out.println("Encoded String: " + encodedString);
    }

    private static String runLengthEncode(String input) {
        StringBuilder encodedString = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);

            if (currentChar == previousChar) {
                count++;
            } else {
                encodedString.append(count);
                encodedString.append(previousChar);
                count = 1;
            }
        }

        encodedString.append(count);
        encodedString.append(input.charAt(input.length() - 1));

        return encodedString.toString();
    }
}
