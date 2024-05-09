package com.usman;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed =2;

    Ball(int x, int y,int width, int height){
        super(x,y,width,height); // Since ball is a sub class so the super class represents a rectangle
        random= new Random();
        int randomXDirection = random.nextInt(2);// this gives the x position two options that is 0 and 1 which means left and right
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection*initialSpeed); // This changes the xDirection to twice what it is supposed to be so it is two times faster

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--; // this means
        setYDirection(randomYDirection*initialSpeed);



    }
    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;

    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;

    }
    public void move(){
        x += xVelocity;
        y += yVelocity;

    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y, width,height); // here the height and width are the ball diameter

    }
}
