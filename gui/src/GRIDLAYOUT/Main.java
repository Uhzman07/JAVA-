package GRIDLAYOUT;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,4,10,10));




        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        frame.add(new JButton("11"));
        frame.add(new JButton("12"));
        frame.add(new JButton("13"));
        frame.add(new JButton("14"));
        frame.add(new JButton("15"));
        frame.add(new JButton("16"));

        frame.setVisible(true);

    }

}
