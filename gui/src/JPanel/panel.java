package JPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class panel {
    public static void main (String[] args){
        ImageIcon icon = new ImageIcon("tigerr.jpg");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 15);
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setText("Usman");
        label.setBounds((int) 62.50, (int) 62.50,125,125);// note if we want a decimal number as dimension we  have to declare it as an integrer

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250, 250);
        redPanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(250,0,250,250);
        greenPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0,250,500,250);
        bluePanel.setLayout(null);














        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.WHITE);
        frame.setIconImage(icon.getImage());
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);



    }
}
