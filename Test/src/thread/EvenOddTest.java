package thread;

public class EvenOddTest {

    private static final int MAX = 20;
    private static volatile int counter = 1;
    private static volatile boolean isOddTurn = true;

    public static void main(String[] args) {
        Thread odd = new Thread(new OddPrint());
        Thread even = new Thread(new EventPrint());
        odd.start();
        even.start();
    }

    static class OddPrint implements Runnable {

        @Override
        public void run() {
            while (counter <= MAX) {
                if (isOddTurn && counter <= MAX) {
                    System.out.println("Odd : " + counter);
                    counter++;
                    isOddTurn = false;
                }
            }
        }
    }

    static class EventPrint implements Runnable {

        @Override
        public void run() {
            while (counter <= MAX) {
                if (!isOddTurn && counter <= MAX) {
                    System.out.println("Even : " + counter);
                    counter++;
                    isOddTurn = true;
                }
            }
        }
    }

}
