package threading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CabTime {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(4);
        Thread emp1 = new Thread(new Employee("EMP 10000", 15000, latch));
        Thread emp2 = new Thread(new Employee("EMP 2", 1000, latch));
        Thread emp3 = new Thread(new Employee("EMP 3", 5000, latch));
        Thread emp4 = new Thread(new Employee("EMP 4", 6, latch));

        // separate threads will start moving all four employees
        // from their office to car parking.

        emp1.start();
        emp2.start();
        emp3.start();
       emp4.start();


        // Driver should not start car until all 4 employees take their seats in the car.

        try
        {
            // carDriver thread is waiting on CountDownLatch to finish
            System.out.println("Waiting for Employee to board !!");
            latch.await();
            System.out.println("All employees have taken their seat, Driver started the car");
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
