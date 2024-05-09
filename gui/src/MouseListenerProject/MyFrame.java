package MouseListenerProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());




        smile = new ImageIcon("smile.jpg");
        nervous = new ImageIcon("nervous.png");
        pain = new ImageIcon("pain.png");
        dizzy = new ImageIcon("dizzy.png");

        label = new JLabel();
        label.addMouseListener(this);
        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null); // This centralises the frame
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(pain);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(dizzy);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(nervous);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(smile);

    }
}
