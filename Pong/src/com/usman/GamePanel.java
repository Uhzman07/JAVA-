package com.usman;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {
    static final int GAME_WIDTH = 1200;
    static final int GAME_HEIGHT = (int) (GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;

    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;


    GamePanel() {
        newPaddles();
        newBall();
        score = new Score(GAME_WIDTH, GAME_HEIGHT);
        this.setFocusable(true);
        this.addKeyListener(new AL()); // the AL is a subclass under this class
        this.setPreferredSize(SCREEN_SIZE);

        gameThread = new Thread(this);
        gameThread.start();

    }
    public void newBall() {
        random = new Random();
        ball = new Ball((GAME_WIDTH/2)-(BALL_DIAMETER/2),random.nextInt(GAME_HEIGHT-BALL_DIAMETER),BALL_DIAMETER,BALL_DIAMETER);// this random means that the ball will appear at that y range given
        // Since the ball diameter represents the width and height as in a circle

    }
    public void newPaddles() {
        paddle1 = new Paddle(0, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 1); // Note that the Paddle height and paddle width that we have put here
        // just signifies that we are stating it down and the 1 at the end is the id

        paddle2 = new Paddle(GAME_WIDTH - PADDLE_WIDTH, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 2);

    }



    public void paint(Graphics g) {
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0, 0, this);


    }

    public void draw(Graphics g) {
        paddle1.draw(g);
        paddle2.draw(g);
        ball.draw(g);
        score.draw(g);


    }

    public void move() {
        paddle1.move();
        paddle2.move();
        ball.move();

    }

    public void checkCollision() {
        // bounce ball off top and bottom window edges
        if(ball.y<=0){
            ball.setYDirection(-ball.yVelocity); // this is to let it go in the opposite direction

        }
        if (ball.y >= GAME_HEIGHT-BALL_DIAMETER){
            ball.setYDirection(-ball.yVelocity);
        }
        // ball bounces off paddles
        if(ball.intersects(paddle1)) { // Note that this only used because both ball and paddle serve as rectangles, intersection only happens at x axis
            ball.xVelocity= Math.abs(ball.xVelocity);// this is a smart way of changing the random direction of the ball since we know that the absolute value will always give negative value
            ball.xVelocity++; // this is a way of increasing the speed as it bounces off the paddle it should be optional based on game difficulty
            if(ball.yVelocity>0)
                ball.yVelocity++;// this should also be optional to increase the velocity of y based on difficulty
            else
                ball.yVelocity--;
            ball.setXDirection(ball.xVelocity);
            ball.setYDirection(ball.yVelocity);

        }
        if(ball.intersects(paddle2)) { // Note that this only used because both ball and paddle serve as rectangles, intersection only happens at x axis
            ball.xVelocity= Math.abs(ball.xVelocity);// this is a smart way of changing the random direction of the ball since we know that the absolute value will always give negative value
            ball.xVelocity++; // this is a way of increasing the speed as it bounces off the paddle it should be optional based on game difficulty
            if(ball.yVelocity>0)
                ball.yVelocity++;// this should also be optional to increase the velocity of y based on difficulty
            else
                ball.yVelocity--;
            ball.setXDirection(-ball.xVelocity); // Since paddle 2 is at the right it needs to go in the opposite direction so we put minus
            ball.setYDirection(ball.yVelocity);

        }
        // this stops paddles at window edges
        if(paddle1.y<=0)
            paddle1.y =0; // This is a way of adding two conditions to the if statement
        if(paddle1.y >= (GAME_HEIGHT -  PADDLE_HEIGHT))
            paddle1.y = GAME_HEIGHT-PADDLE_HEIGHT;
        if(paddle2.y<=0)
            paddle2.y =0; // This is a way of adding two conditions to the if statement
        if(paddle2.y >= (GAME_HEIGHT -  PADDLE_HEIGHT))
            paddle2.y = GAME_HEIGHT-PADDLE_HEIGHT;

        // Give a player 1 point and creates new paddles and ball
        if(ball.x <=0){
            score.player2++;
            newPaddles();// This creates a new paddle
            newBall(); // this creates a new ball
            System.out.println("Player 2 = "+score.player2);
        }
        if(ball.x >= GAME_WIDTH-BALL_DIAMETER){
            score.player1++;
            newPaddles();// This creates a new paddle
            newBall(); // this creates a new ball
            System.out.println("Player 1 = "+score.player1);
        }





    }

    public void run() {
        // game loop
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks; // This represents nano seconds
        double delta = 0;
        while (true) { // that is while it is running
            long now = System.nanoTime(); // That is whatever the time of the system says
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                move();
                checkCollision();
                repaint();
                delta--;



            }
        }


    }

    public class AL extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            paddle1.keyPressed(e);
            paddle2.keyPressed(e);

        }


        public void keyReleased(KeyEvent e) {
            paddle1.keyReleased(e);
            paddle2.keyReleased(e);
        }

    }
}
