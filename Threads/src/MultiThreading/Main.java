package MultiThreading;
// MULTITHREADING
// There are two ways of creating multi threads
// 1. by using an extension of the "Thread" class
// 2. by implementing the "runnable" class and then adding it to the Thread instance


public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Create a sub class of Thread
        MyThread thread1 = new MyThread();

        // implement runnable interface and pass instance as an argument to Thread
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

        //thread1.setDaemon(true);// since we have both threads set to daemon, we get an exception when
        //thread2.setDaemon(true);// we run both since deamon threads are irrelevant


        thread1.start();


        //thread1.join();// This allows this thread to finish running before another thread joins
        //thread1.join(3000); // This allows this thread to run foe 3 seconds before the other thread joins and starts running simultaneously

        thread2.start();

        //System.out.println(1/0); /// this throws an exception but does not affect the code



    }
}
