import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame("LAUNCH PAGE");
    JButton myButton = new JButton("New Window");


    LaunchPage(){  // this is used since the launch page instance created is not in this class
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener((ActionListener) this);
        myButton.setForeground(Color.BLUE);







        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            frame.dispose(); //  this disposes the frame so as to avoid repetition
            NewWindow myWindow = new NewWindow();
        }

    }
}
