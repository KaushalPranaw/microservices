public class FractionAdder {
    public static void main(String[] args) {
        int numerator1 = 1;
        int denominator1 = 4;

        int numerator2 = 3;
        int denominator2 = 8;

        int[] result = addFractions(numerator1, denominator1, numerator2, denominator2);

        System.out.println("Result: " + result[0] + "/" + result[1]);
    }

    private static int[] addFractions(int numerator1, int denominator1, int numerator2, int denominator2) {
        int commonDenominator = denominator1 * denominator2;

        int newNumerator1 = numerator1 * denominator2;
        int newNumerator2 = numerator2 * denominator1;

        int sumNumerators = newNumerator1 + newNumerator2;

        int[] result = simplifyFraction(sumNumerators, commonDenominator);

        return result;
    }

    private static int[] simplifyFraction(int numerator, int denominator) {
        int gcd = findGCD(numerator, denominator);

        int simplifiedNumerator = numerator / gcd;
        int simplifiedDenominator = denominator / gcd;

        int[] simplifiedFraction = {simplifiedNumerator, simplifiedDenominator};

        return simplifiedFraction;
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
