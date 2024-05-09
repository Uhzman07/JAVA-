package ganimation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0; // this is for the x and y axis
    int y = 0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        enemy = new ImageIcon("enemy.png").getImage();
        backgroundImage = new ImageIcon("").getImage();
        timer = new Timer(10,this); // the 10 here means that for every 10 milli seconds and the this means that we are adding an action listener
        timer.start(); // this starts the timer

    }
    public void paint(Graphics g){
        super.paint(g); // the super here refers to the panel
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage,0,0,null);
        g2D.drawImage(enemy,x,y,null); // this shows that the enemy image owns the x and y axis that have been stored

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (x>= PANEL_WIDTH-enemy.getWidth(null) || x<0){// since the top left corner of the image marks the x and y axis, this means if the image reaches the left or right side

            xVelocity = xVelocity * -1;

        }
        x = x + xVelocity; // this means the value of x increases by the value of the x velocity
        repaint(); // Note that we must repaint because the image "enemy" belongs to the paint component

        if (y>= PANEL_HEIGHT-enemy.getHeight(null) || y<0){
         yVelocity = yVelocity * -1;
        }
        y = y + yVelocity; // this increases the value of y by the value of the yVelocity which is -1
        repaint(); // we might not need to repaint() as stated earlier because this covers all

        // Since we are combining these two together the motion will be diagonal




    }
}
