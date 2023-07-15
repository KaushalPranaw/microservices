public class SquareRootCalculator {
    public static void main(String[] args) {
        double number = 2;
        double squareRoot = calculateSquareRoot(number);

        System.out.println("Square root of " + number + " is: " + squareRoot);
    }

    private static double calculateSquareRoot(double number) {
//        double guess = number / 2.0; // Initial guess
//        double threshold = 0.0001; // Threshold for convergence
//
//        while (Math.abs(guess * guess - number) > threshold) {
//            guess = (guess + number / guess) / 2.0; // Improved guess using Newton-Raphson method
//        }
//
//        return guess;

        double guess=number/2.0;
        double threshold=0.0001;
        while(Math.abs(guess*guess-number)>threshold){
            guess=(guess+number/guess)/2.0;
        }
        return guess;
    }
}
