package com.usman;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Score extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;

    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas",Font.PLAIN,60));

        g.drawLine(GAME_WIDTH/2,0,GAME_WIDTH/2,GAME_HEIGHT);

        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10),(GAME_WIDTH/2)-85,50);// This is quite arithmetic, we want to create tens and units for our score board, the first number will always be an integer so if it is less than 10 it will be zero automatically
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10),(GAME_WIDTH/2)+85,50);//the second value which is the units value the modulus of the number that is remainder so it all fits in well

    }

}
