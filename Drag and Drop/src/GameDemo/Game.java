package GameDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    JFrame frame;
    JLabel label;
    Action upAction; // Since this method is an Action by nature
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game(){
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.black);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.setBounds(100,100,100,100);

        upAction = new UpAction(); // To create an instance of the classes created below
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction"); // the action map key is just a given a name it is obligatory
        label.getActionMap().put("upAction", upAction); // upAction is the Action while "upAction" is the name like above
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction",downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction",leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction",rightAction);

        // Note that the UP, DOWN , LEFT and RIGHT key stroke represents the 4 arrow keys
        // This key stroke could also be 'w' or any other single character in a colon

        frame.add(label);
        frame.setVisible(true);



    }
    public class UpAction extends AbstractAction{ // AbstractAction is for action performed like that of button listener

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);

        }
    }
    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }























}
