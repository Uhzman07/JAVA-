package JOptionPane;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        /* Format JOptionPane.showMessageDialog(ParentComponent, message, title, message type);
        //JOptionPane.showMessageDialog(null,"This is some information", "MESSAGE", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"These are some information for you","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Bro, do you even code", "QUESTION", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a warning message", "WARNING", JOptionPane.WARNING_MESSAGE );
        //JOptionPane.showMessageDialog(null, "This is an error message", "ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);

        ////// WAY TO ANNOY A USER this will never take the pop up away no matter what
        //while(true) {
            JOptionPane.showMessageDialog(null, "Your laptop has a virus !", " ERROR ERROR !!",JOptionPane.ERROR_MESSAGE);

         */

       /* FOR THE USER RESPONSE WITH OPTIONS
        JOptionPane.showConfirmDialog(null,"Choose your option please", "CONFIRM", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(JOptionPane.showConfirmDialog(null,"Choose your option please", "CONFIRM", JOptionPane.YES_NO_CANCEL_OPTION));// for this when "Yes" is clicked we see 0 "NO" = 1 "CANCEL" = 2 "EXIT" = 0 on thr terminal
        int answer = JOptionPane.showConfirmDialog(null,"Choose your option please", "CONFIRM", JOptionPane.YES_NO_CANCEL_OPTION);// We can also store it in a variable
        */


        /* TO GET INPUT FROM A USER
        String name = JOptionPane.showInputDialog("What is your name ?");
        System.out.println(" HELLO " + name);

         */


        // SHOW OPTION DIALOG >>>> This is the combination of all the remaining
        //JOptionPane.showOptionDialog(parent component, message , title, option type, message type, icon, options, initial value);
        //JOptionPane.showOptionDialog(null, "You are awesome", "SECRET MESSAGE",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null, null, 1);
        // In order to add our own icon and options
        ImageIcon icon = new ImageIcon("smile.jpg");
        String[] responses = {"You are right!", "Thank You", "Blush"};
        JOptionPane.showOptionDialog(null, "Do you know that you are awesome", "SECRET MESSAGE", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, responses, 0);
    }
}









