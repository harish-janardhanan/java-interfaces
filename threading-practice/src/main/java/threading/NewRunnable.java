package threading;

public class NewRunnable implements Runnable {

    MyClass myClass = new MyClass();

    @Override
    public void run(){
        myClass.instance++;
        System.out.println(Thread.currentThread().getName() + " has value " + myClass.instance);
    }
}
