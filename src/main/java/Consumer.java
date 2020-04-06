import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {

    private BlockingQueue queue;

    Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override public void run() {

        while (true) {
            try {
                System.out.println("consumer--->" + queue.take());
            }
            catch (InterruptedException e) {
                Logger.getLogger("consumer").log(Level.ALL, "consumer exception", e);
            }
        }
    }
}
