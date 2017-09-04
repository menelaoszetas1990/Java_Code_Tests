package Threads.Thread;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("the runnable go");
        go();
    }

    public void go() {
        System.out.println("the runnable do more");
        doMore();
    }

    public void doMore() {
        System.out.println("the runnable do more 2");
        doMore2();
    }

    public void doMore2() {
        System.out.println("The runnable class");
    }
}
