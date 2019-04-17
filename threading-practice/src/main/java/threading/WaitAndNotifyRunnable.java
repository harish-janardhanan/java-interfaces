package threading;

public class WaitAndNotifyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is processing....");

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
