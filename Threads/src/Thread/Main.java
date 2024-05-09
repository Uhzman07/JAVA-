package Thread;

public class Main {
    public static void main( String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount()); // This displays the number of threads that are currently active which is one before creating the other thread

        Thread.currentThread().setName("MAIN"); // This changes the thread name from "main" to "MAIN"
        System.out.println(Thread.currentThread().getName()); // This is used to get the name of the current Thread which is normally "main"


        Thread.currentThread().setPriority(10); // The priority is on a scale of 1 to 10
        System.out.println(Thread.currentThread().getPriority());// This changes the priority from 5 to 10


        System.out.println(Thread.currentThread().isAlive()); // This checks if the main Thread is alive

        for (int i = 3; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.println("You are done !");


        MyThread thread2 = new MyThread();
        thread2.setDaemon(true); // This turns it to a daemon thread but it is normally a user thread
        System.out.println(thread2.isDaemon());

        thread2.start();
        //thread2.run(); // this is the run method from the other class
        System.out.println(thread2.isAlive());

        thread2.setName("2nd Thread"); // this changes the thread name which was "Thread-0" before
        System.out.println(thread2.getName());

        thread2.setPriority(1);
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount()); // this displays 2 since we have created the second thread
    }
}
