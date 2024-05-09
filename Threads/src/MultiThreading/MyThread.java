package MultiThreading;

public class MyThread extends Thread{ // This is not advisable because a class can only have one parent class


    @Override
    public void run(){
        for( int i = 10; i>0; i--){
            System.out.println(" Thread #1 " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // System.out.println(1/0); // this causes an exception in thr thread 1 and stops it from running
        }
        System.out.println("Thread #1 is finished :)");
    }
}
