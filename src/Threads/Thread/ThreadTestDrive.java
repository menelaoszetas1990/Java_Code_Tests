package Threads.Thread;

public class ThreadTestDrive {
    public static void main (String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        try {
            //makes the main to sleep ! DO NOT DO IT THOUGH (UI problems)
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Main program");
    }
}
