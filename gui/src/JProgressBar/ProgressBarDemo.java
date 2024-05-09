package JProgressBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarDemo  {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);
    JButton button = new JButton();


    ProgressBarDemo() {
        bar.setValue(0); // this is used to set the initial value of the progress bar to any integer
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true); // this automatically brings out the percentage reader
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        /*button.setText("DOWNLOAD");
        button.setBounds(110, 85, 200, 30);
        button.setForeground(Color.white);
        button.setBackground(Color.green);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.BLACK));
        button.addActionListener(this);
        
         */


        frame.add(bar);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);


        fill(); // this is a way of creating the fill method in the public class before creating its own sub class so others can access it


    }







        public void fill () {
            int counter = 0; // we have to make it start from beginning by doing this

            while (counter <= 100) { // this is used to show that as long as the counter is 100 percent
                bar.setValue(counter);
                try {
                    Thread.sleep(50); // this indicates the speed of the counter which is 50 milli seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter += 1; // this indicates the increment value of the counter that is it increases by 1 percent every 50 milli seconds as stated above
            }
            bar.setString("DONE !!!!");
        }
    }





