package JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("smile.jpg");
        checkIcon = new ImageIcon("pot.jpg");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setBorder(BorderFactory.createBevelBorder(2,Color.red,Color.GREEN));
        button.setFocusable(false);


        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.BOLD,35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);


        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }

    }
}
