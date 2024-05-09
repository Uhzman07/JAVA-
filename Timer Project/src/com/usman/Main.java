package com.usman;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter =10; // note that we must always declare a variable outside a statement
            @Override
            public void run() {

                if( counter > 0){
                    System.out.println(counter+"seconds remaining");
                    counter--;
                                 // meaning the counter value should reduce by 1 after the task has been completed
                }
                else{
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel(); // this stops anything about the timer function
                }
            }
        };
        Calendar date = Calendar.getInstance(); // this is a way of setting the desired time
        date.set(Calendar.YEAR,2022);
        date.set(Calendar.MONTH,Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23);// Note that we are using the military timing here and this represents 11pm midnight
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task,0); // This performs the run() function immediately that is 0 milliseconds
        //timer.schedule(task,date.getTime()); // This performs the task immediately the given time matches the system time
        //timer.scheduleAtFixedRate(task,0,1000); // this performs the task starting immediately with an interval of 1 second
        timer.scheduleAtFixedRate(task,date.getTime(),1000); // this performs the task starting from the given time with an interval of 1 second




    }
}
