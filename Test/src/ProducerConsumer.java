import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> shared = new LinkedBlockingQueue<>();

        Thread prod = new Thread(new Producer(shared));
        Thread cons = new Thread(new Consumer(shared));
        cons.start();

        prod.start();


    }
}

class Producer implements Runnable {
    private BlockingQueue<Integer> sharedQueue;

    public Producer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Produced: " + i);
            try {
                sharedQueue.put(i);
            } catch (InterruptedException e) {
                System.out.println("catch producer");
                throw new RuntimeException(e);
            }
        }

    }
}

class Consumer implements Runnable {

    private BlockingQueue<Integer> sharedQueue;

    public Consumer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {

        while (true) {
            try {
                System.out.println("Consumed: " + sharedQueue.take());
            } catch (InterruptedException e) {
                System.out.println("catch consumer");
                throw new RuntimeException(e);
            }
        }

    }
}