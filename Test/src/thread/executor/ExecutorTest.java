package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService e= Executors.newSingleThreadExecutor();
        System.out.println("Shutdown executor");
        e.submit(new Thread());
        e.shutdown();
        try {
            e.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            System.out.println("Task interrupted");
        }finally {
            if(!e.isTerminated()){
                System.out.println("Cancel non finished task");
            }
            e.shutdownNow();
            System.out.println("Shutdown finished");
        }
    }

    static class Task implements Runnable{

        @Override
        public void run() {
            Long duration=(long)Math.random()*20;
            System.out.println("Running task");
            try {
                TimeUnit.SECONDS.sleep(duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
