public class DotProductCalculator {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int dotProduct = calculateDotProduct(array1, array2);

        System.out.println("Dot Product: " + dotProduct);
    }

    private static int calculateDotProduct(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int dotProduct = 0;

        for (int i = 0; i < array1.length; i++) {
            dotProduct += array1[i] * array2[i];
        }

        return dotProduct;
    }
}
