package com.usman;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file1 = new File("meme.wav");
        File file2 = new File("bum.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip1 = AudioSystem.getClip();
        Clip clip2 = AudioSystem.getClip();

        clip1.open(audioStream);
        clip2.open(audioStream2);
        // clip1.start();
        //  clip2.start();


        ;

        String response = "";// note we have to name response as vacant by doing this it is compulsory before setting it as a prompt for input
        while (!response.equals("Q")) {

            System.out.println("Press P to play audio 1 \n Press T to play audio 2 \n Press Z to restart audio 1 \n Press H to restart audio 2 \n Press L to toggle audio 1 \n Press E to toggle audio 2 \n Press U to stop audio 1 \n Press A to stop audio 2 ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response) {
                case ("P") : clip1.start();
                break;


                case ("T") : clip2.start();
                break;


                case ("U") : clip1.stop();
                break;

                case ("A") : clip2.stop();
                break;

                case ("Z") : clip1.setMicrosecondPosition(0);
                break;// this is to restart the song
                case ("H"):  clip2.setMicrosecondPosition(0);
                break;// because 0 signifies beginning in java
                case ("L") :clip1.setMicrosecondPosition(1);
                break;
                case ("E") :clip2.setMicrosecondPosition(7);
                
                break;
                default :

                    System.out.println("Not a valid response");
            }


        }

        System.out.println("bye");


    }
}
