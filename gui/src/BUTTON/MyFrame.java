package BUTTON;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.TOP;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("eyes.jpg");
        ImageIcon icon2 = new ImageIcon("dragon.png");
        label = new JLabel();
        label.setIcon(icon2);

        label.setBounds(200,200,200,200);
        button = new JButton();
        button.addActionListener(this);
        button.setBounds(150,200,200,50);
        button.setText("TAP");
        button.setFocusable(false);
        //button.setIcon(icon2);
        button.setVerticalAlignment(JButton.CENTER);
        button.setHorizontalAlignment(JButton.CENTER);// note that since we only used text and no icon we have to use alignment instead of text position
        button.setBackground(Color.GREEN);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Cosmic Sons", Font.BOLD,20));
        button.setBorder(BorderFactory.createEtchedBorder());



        //button.setIcon(icon2);
        //button.setIconTextGap(2000);





















        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.getContentPane().setBackground(new Color(123,234,234));
        this.setVisible(true);
        this.add(button);
        this.add(label);
        label.setVisible(false);





















    }












    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
           // button.setEnabled(false); this is used to disable the button
            label.setVisible(true);
        }

    }
}
