public class PowerCalculator {
    public static void main(String[] args) {
        int number = 2;
        int exponent = 5;

        long result = calculatePower(number, exponent);

        System.out.println(number + " raised to the power of " + exponent + " is: " + result);
    }

    private static long calculatePower(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            long temp = calculatePower(number, exponent / 2);
            return temp * temp;
        } else {
            long temp = calculatePower(number, (exponent - 1) / 2);
            return number * temp * temp;
        }
    }
}
