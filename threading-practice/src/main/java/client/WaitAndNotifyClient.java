package client;

import threading.WaitAndNotifyRunnable;

public class WaitAndNotifyClient {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new WaitAndNotifyRunnable());

        Thread thread2 = new Thread(new WaitAndNotifyRunnable());
    }
}
