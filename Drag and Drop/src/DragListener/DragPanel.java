package DragListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("frog.png");
    final int WIDTH = image.getIconWidth(); // This is used to store the width of the image as a constant throughout the program
    final int HEIGHT = image.getIconHeight(); // Used to store the height of the image as "HEIGHT" throughout the program
    Point imageCorner;
    Point prevPt;
    Point currentPt;


    DragPanel() {
        imageCorner = new Point(0,0); // This sets the default position of thr image to be considered as (0,0) that the origin at the top corner
        ClickListener clickListener = new ClickListener(); // we should create the instance since we have their sub classes already
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener); // Since mouseListener function is from the clickListener class here we should not put "this"
        this.addMouseMotionListener(dragListener); // Since the mouseMotionListener is from the dragListener class



    }


    public void paintComponent(Graphics g) { // Note that Graphics g here is compulsory
        // The paint component class has to do with the control of the component which is the image in the panel at this instance
        super.paintComponent(g); // Since we have created the JPanel extension as the main class we can refer it as "super" so as to be able to be able to paint the component it is also used since this class contains many sub classes so it can over shadow it
        // super is used instead of "this" since we are in an entirely different class on its own
        image.paintIcon(this,g,(int) imageCorner.getX(),(int) imageCorner.getY());
// here we dictate which parent component our image belongs to, its x and y points which is relative to that of the panel
    }
    private class ClickListener extends MouseAdapter { // we used private so that it doesn't interfere, This takes the function of a mouse adapter
        // Since it behaves like mouse adapter we can add a mouse listener

        public void mousePressed(MouseEvent e) { // THIS IS ONE OF THE FUNCTIONS OF THE MOUSE LISTENER
            prevPt = e.getPoint(); // This updates the prevPt that is, previous point as the point pressed by the mouse (clicked)


        }
    }
    private class DragListener extends MouseMotionAdapter{ // This means this class can behave like a mouse motion adapter therefore, we can add a mouse Listener
        public void mouseDragged(MouseEvent e) { // Meaning when the mouse is dragged
            currentPt = e.getPoint(); // This stores the point which the mouse is dragged to as the currentPt that is current point

            // The translate function is used to assume a new position a component which is our panel here i.e we want to change the point imageCorner from (0,0) to any point we want
            imageCorner.translate(
                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY())
              // Here we wil translate the point to the new x and y points relative to the prevPt
              /*
               To get the axes of the image we have to subtract the prevPt of x and y from the currentPt of x and y so as to change the x and y point to a new one
               We are subtracting the prevPt so that it will be relative since the prevPoint won't remain (0,0) forever
               */

            );
            prevPt = currentPt; // meaning after the change in position has been executed, the prevPoint should be the currentPoint once again
            repaint(); // Meaning the component i.e image should also follow the command of the paint component all over again


        }
    }
}
