import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {

    private BlockingQueue queue;

    Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override public void run() {

        for(int i = 0; i < 10; i++) {
            try {
                System.out.println("producer--->" + i);
                queue.put(i);
            }
            catch (InterruptedException e) {
                Logger.getLogger("Producer").log(Level.ALL, "producer exception", e);
            }
        }
    }
}
