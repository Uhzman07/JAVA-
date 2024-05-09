package JTextField;

import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());// So as to make the components have a horizontal placement

        button = new JButton("Submit");
        //button.setBackground(Color.green);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setForeground(Color.red);
        button.setBackground(Color.white);


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));
        textField.setBackground(new Color(4,196,2));
        textField.setCaretColor(Color.white); // this is like a line that blinks while typing


        textField.setText("Username");
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("Hello " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);// this makes the text in the textfield not to be editable anymore

        }

    }
}
