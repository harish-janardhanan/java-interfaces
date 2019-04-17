package client;

import threading.MyClass;
import threading.NewRunnable;
import threading.volatiletest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Client {

    public static void main(String[] args) {
        System.out.println("Main Starting....");

        CyclicBarrier cyclicBarrier = new CyclicBarrier(1000);

  //      CountDownLatch countDownLatch = new CountDownLatch(10);

        MyClass myClass = new MyClass();

        ExecutorService executorService = Executors.newFixedThreadPool(1000);

        ExecutorService executorService1 = Executors.newFixedThreadPool(1000);
        volatiletest volatiletest = new volatiletest(cyclicBarrier, myClass );

        for (int i =0 ; i <1000 ; ++i){
            executorService.submit(volatiletest );

        }

        for (int i = 0 ; i < 1000 ; ++i){
            executorService1.submit(volatiletest);
        }

/*        Thread t = new Thread (new NewRunnable());
        t.start();*/

/*        try {
            countDownLatch.await();
        }catch (InterruptedException  e) {
            e.printStackTrace();
        }*/



        executorService.shutdown();
        executorService1.shutdown();
        System.out.println("Main Exiting.....");
    }
}
