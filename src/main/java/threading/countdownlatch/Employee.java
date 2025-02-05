package threading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Employee implements Runnable{
    private String name;
    private Integer totalWorkHour;
    private CountDownLatch latch;

    public Employee(String name, int totalWorkHour, CountDownLatch latch) {
        this.name = name;
        this.totalWorkHour = totalWorkHour;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(totalWorkHour);
        } catch (InterruptedException ex) {
            System.err.println("Error : ");
            ex.printStackTrace();
        }
        System.out.println( name + " has taken his seat");
        latch.countDown(); //reduce count of CountDownLatch by 1
    }
}
