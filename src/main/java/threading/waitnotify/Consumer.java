package threading.waitnotify;

import java.util.Queue;

public class Consumer implements Runnable{
    Queue<Integer> sharedQ;
    Integer qSize;
    public Consumer(Queue<Integer> sharedQ, int i) {
        this.sharedQ = sharedQ;
        this.qSize = i;
    }

    @Override
    public void run(){
        while(true)
        {
            synchronized (sharedQ) {
                while(sharedQ.isEmpty())
                {
                    try {
                        System.out.println("Que is Empty");
                        sharedQ.wait();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                int number = (int) sharedQ.poll();
                System.out.println("removing Element " + number);
                sharedQ.notify();

            }
        }
    }
}
