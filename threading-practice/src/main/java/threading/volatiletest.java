package threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class volatiletest implements Runnable {

    final CyclicBarrier cyclicBarrier;

     final MyClass myClass;


    public volatiletest(CyclicBarrier cyclicBarrier, MyClass myClass){
        this.cyclicBarrier = cyclicBarrier;
        this.myClass = myClass;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing....");
        try {
            incrementInstance();
            System.out.println(Thread.currentThread().getName() + " has value" + myClass.instance);
        //    Thread.sleep(5000L);

       //     cyclicBarrier.await();
        } catch (Exception  e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " exiting....");
    }

    void incrementInstance(){
        System.out.println(Thread.currentThread().getName() + " executing increment");
        myClass.instance++;
    }
}
