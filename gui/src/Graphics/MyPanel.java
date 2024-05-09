package Graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image; // Note that we can actually store an image as an Image ordinarily without turning it to an ImageIcon

    MyPanel(){
        image = new ImageIcon("eyes.jpg").getImage();

        this.setPreferredSize(new Dimension(500,500)); // we set preferred size because it is over laying




    }




    public void paint (Graphics g){
        Graphics2D g2D = (Graphics2D)g; // we make our stored graphics g2D a 2D graphics

        g2D.drawImage(image,0,0,null);
        //g2D.setPaint(Color.blue);
        //g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0,0,500,500);

        //g2D.setPaint(Color.pink);
        //g2D.drawRect(0,0,100,200);
        //g2D.fillRect(0,0,100,200);

        //g2D.setPaint(Color.orange);
        //g2D.drawOval(150,0,100,100);
        //g2D.fillOval(150,0,100,100);

        g2D.setPaint(Color.red);
        g2D.drawArc(300,0,100,100,0,180);
        g2D.fillArc(300,0,100,100,0,180);
        g2D.setPaint(Color.white);
        g2D.fillArc(300,0,100,100,180,180);

        // To draw a polygon, we have to set the points

        int[] xPoints = {150,250,350}; // these are the x coordinates for the 3 points of a triangle
        int[] yPoints = {300,150,300}; // these are the y coordinates for thr 3 points of a triangle
        g2D.setPaint(Color.yellow);
        g2D.drawPolygon(xPoints,yPoints,3); // number of points is 3 meaning it is a triangle
        g2D.fillPolygon(xPoints,yPoints,3);

        int[] Pointsx = {50,150,250}; // these are the x coordinates for the 3 points of a triangle
        int[] Pointsy = {450,300,450}; // these are the y coordinates for thr 3 points of a triangle
        g2D.setPaint(Color.yellow);
        g2D.drawPolygon(Pointsx,Pointsy,3); // number of points is 3 meaning it is a triangle
        g2D.fillPolygon(Pointsx,Pointsy,3);

        int[] Points1 = {250,350,450}; // these are the x coordinates for the 3 points of a triangle
        int[] Points2 = {450,300,450}; // these are the y coordinates for thr 3 points of a triangle
        g2D.setPaint(Color.yellow);
        g2D.drawPolygon(Points1,Points2,3); // number of points is 3 meaning it is a triangle
        g2D.fillPolygon(Points1,Points2,3);


        // Too draw a String
        g2D.setPaint(Color.magenta);
        g2D.setFont(new Font("Ink Free",Font.BOLD,50));
        g2D.drawString("I AM A WINNER !",50,50);










    }
}
