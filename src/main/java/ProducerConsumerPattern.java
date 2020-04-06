import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {

    public static void main(String[] args) {

        BlockingQueue sharedQueue = new LinkedBlockingQueue();

        Thread p  = new Thread(new Producer(sharedQueue));
        Thread c  = new Thread(new Consumer(sharedQueue));

        p.start();
        c.start();

    }
}
