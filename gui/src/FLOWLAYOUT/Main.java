package FLOWLAYOUT;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));


        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.MAGENTA);
        panel.setLayout(new FlowLayout());



        //since we havent created any specific button, we can just use new JButton instead of JButton button because it actually creates a particular button instead
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        //panel.add(new JButton("10"));
        //panel.add(new JButton("11"));




        frame.add(panel);
        frame.setVisible(true);
    }
}
