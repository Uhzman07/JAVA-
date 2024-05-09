import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file1 = new File("usman.wav");
        File file2 = new File("Tam Tam.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
        AudioInputStream audioStreams = AudioSystem.getAudioInputStream(file2);
        Clip clip = AudioSystem.getClip();
        Clip clip2 = AudioSystem.getClip();
        clip.open(audioStream);
        clip2.open(audioStreams);
        String response = "";

        while (!response.equals("Q")) {
            System.out.print(
                    "Please enter a valid response\nPress P to start audio 1\n Press T to start audio 2\nPress K to restart audio 1\n Press R to toggle audio 1\n PressS to restart audio 2\n Press U to toggle audio 2\n Press I to stop audio 1\n Press X to stop audio 2   ");
            response= scanner.next();
            response= response.toUpperCase();
            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("T"):
                    clip2.start();
                    break;
                case ("K"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(1);
                    break;
                case ("S"):
                    clip2.setMicrosecondPosition(0);
                    break;
                case ("U"):
                    clip2.setMicrosecondPosition(1);
                    break;
                case ("I"):
                    clip.stop();
                    break;
                case ("X"):
                    clip2.stop();
                    break;
                case("G") :clip2.setMicrosecondPosition(3);
                break;
                default:
                    System.out.println("Rubbish");
                    System.out.println("bye");
            }
        }
    }
}































