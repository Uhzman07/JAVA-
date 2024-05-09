package BORDERLAYOUT;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main (String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10,10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();


        JLabel label = new JLabel();
        label.setText("IBRAHIM");
        label.setForeground(new Color(76,23,33));
        label.setFont(new Font("Cosmic Sims", Font.BOLD,30));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(100,100));
        panel7.setPreferredSize(new Dimension(100,100));
        panel8.setPreferredSize(new Dimension(100,100));
        panel9.setPreferredSize(new Dimension(100,100));
        panel10.setPreferredSize(new Dimension(100,100));

        panel1.setBackground(Color.GREEN);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.MAGENTA);
        panel4.setBackground(Color.pink);
        panel5.setBackground(Color.RED);
        panel6.setBackground(Color.yellow);
        panel7.setBackground(Color.GRAY);
        panel8.setBackground(Color.orange);
        panel9.setBackground(Color.cyan);
        panel10.setBackground(Color.darkGray);


        panel5.setLayout(new BorderLayout());
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);
        panel5.add(label);



        frame.add(panel1, BorderLayout.SOUTH);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.NORTH);
        frame.add(panel5, BorderLayout.CENTER);








    }
}
