package JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ImageIcon image2 = new ImageIcon("pot.jpg");// note the create prompt function should come at the beginning
        Border border = BorderFactory.createLineBorder(Color.GREEN,3)  ;
        JLabel label = new JLabel();// note the Jlabel must come before the Jframe


        
        label.setText("Usman you are getting better at coding");
        label.setIcon(image2);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.CYAN);
        label.setFont(new Font("MV Boli",Font.ITALIC,20));// note this includes the font name, font style , font size
        label.setIconTextGap(10);
        label.setBackground(new Color(23,45,56));    // this has no effect because doesnt have any plain background
        label.setOpaque(true);        // this is compulsory so as to be able to add colour that is so that the colur we want to add will over power that of the frame
        label.setBorder(border);
        label.setBounds(50,50,50,50); // for changing the entire size of the label
        

        ImageIcon image = new ImageIcon("9.jpg");
        JFrame frame = new JFrame();// since we are not just creating any prompt but an already in built prompt we have to add ()

        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(234,45,56));
        frame.setIconImage(image.getImage());
        frame.add(label);
        // frame.pack();        //  this is used to resize the shape of the label to the exact size of thr frame


	// write your code here
    }
}
