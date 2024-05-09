package MultiThreading;

public class MyRunnable implements Runnable{ // Note that this is commonly used by most programmers because a class can only have a parent class

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished");

    }
}
