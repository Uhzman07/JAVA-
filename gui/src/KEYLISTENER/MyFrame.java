package KEYLISTENER;           // NOTE : e.getkeyChar(); This is used to get the actual character on the key
                               // NOTE : e,getkeyCode(); This is used to get the code of each key's character
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this); // the "this" in front represents the JFrame it extends and the "this" in the bracket shows that the keyListener is implemented

        icon = new ImageIcon("rocket.png");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        //label.setBackground(Color.red);
        //label.setOpaque(true);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }
    // Note that these three public void methods are implemented automatically
    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped= Invoked when a key is typed. Uses keyChar, char Output
        //It is only effective when a key is  to be pressed(clicked) once and not to be held down
        //Here, instead of using an if statement we can just use a ("switch" , "case:") statement

        switch (e.getKeyChar()) {// Meaning we want to use a key Character directly examples like letters and symbols
            case 'a' : // note that for character we only use '' instead of ""
                label.setLocation(label.getX() - 10, label.getY()); // Moves the label containing the image to the left by 10 pixels
                break;
            case 'w' :
                label.setLocation(label.getX(), label.getY() - 10); // Moves down by 10 pixels
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10); // Moves up by 10 pixels
                break;
            case 'd' :
                label.setLocation(label.getX() + 10, label.getY()); // Moves to the right by 10 pixels
                break;

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses keyCode , int output
        //This method is used when we need to press a key character example "arrow key" down for a while

        switch(e.getKeyCode()){ // Since we cannot type an arrow sign we can get it to use by using its key code and we can get the key code of any key character by System.out,println(e.getkeyCode); below
            case 37 : // THIS IS THE KEY CODE FOR LEFT
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 38 : // THIS IS THE KEY CODE FOR DOWN
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 39 : // THIS IS THE KEY CODE FOR RIGHT
                label.setLocation(label.getX()+10, label.getY());
                break;
            case 40 : // THIS IS THE KEY CODE FOR UP
                label.setLocation(label.getX(), label.getY()+10);
                break;



        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = called whenever a button is released

        System.out.println("You released key Character : " + e.getKeyChar()); // This outputs the character of the key pressed
        System.out.println("You released Key Code :" + e.getKeyCode()); // This outputs the code of the key pressed


    }
}
