import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame("WINDOW");
    JLabel label = new JLabel();



    NewWindow() {
        label.setBounds(100,100,200,200);
        label.setText("Hello World");
        label.setBackground(Color.green);
        label.setFont(new Font("null",Font.BOLD,20));
        label.setForeground(Color.ORANGE);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);




        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setVisible(true);
    }


}
