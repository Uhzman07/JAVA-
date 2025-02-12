package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener{
    JLabel label;



    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this); // This makes only the label component sensitive to mouse clicked

        this.add(label);
        this.setVisible(true);

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has clicked (pressed and released) on a component
        System.out.println("You clicked the mouse");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when the mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        label.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
        label.setBackground(Color.green);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse pointer enters a component space
        System.out.println("You entered the component");
        label.setBackground(Color.BLUE);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits the component space
        System.out.println("You exited the component");
        label.setBackground(Color.YELLOW);

    }
}
