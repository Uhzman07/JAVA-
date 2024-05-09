package JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;




    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20,0));

        pizzaIcon = new ImageIcon("pizza.png");
        hamburgerIcon = new ImageIcon("hamburger.png");
        hotdogIcon = new ImageIcon("hotdog.png");

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdog");


        ButtonGroup group = new ButtonGroup(); // This is usually used to store different button instances in one group so that a button can be clicked at once
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);


        pizzaButton.setBackground(Color.white);
        hamburgerButton.setBackground(Color.white);
        hotdogButton.setBackground(Color.white);

        pizzaButton.setForeground(Color.black);
        hamburgerButton.setForeground(Color.black);
        hotdogButton.setForeground(Color.black);

        pizzaButton.setFont(new Font("Consolas", Font.BOLD, 35));
        hamburgerButton.setFont(new Font("Consolas", Font.BOLD, 35));
        hotdogButton.setFont(new Font("Consolas", Font.BOLD, 35));



        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon); // this is the icon that shows before selecting anything
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        pizzaButton.setSelectedIcon(new ImageIcon("Cancel.png"));
        hamburgerButton.setSelectedIcon(new ImageIcon("Cancel.png"));
        hotdogButton.setSelectedIcon(new ImageIcon("Cancel.png"));



        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);





        this.getContentPane().setBackground(Color.green);
        this.pack();
        this.setVisible(true);














    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza");
        }
        else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger");
        }
        else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered a hotdog");
        }
    }
}
