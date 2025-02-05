package threading.waitnotify;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerMain {
    public static void main(String[] args) {

        final Queue<Integer> sharedQ = new LinkedList < Integer >();
        Thread producer = new Thread( new Producer(sharedQ,5),"Producer");
        Thread consumer = new Thread( new Consumer(sharedQ,5),"Consumer");
        producer.start();;
        consumer.start();
    }
}
