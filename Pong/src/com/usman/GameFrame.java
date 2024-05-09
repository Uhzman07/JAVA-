package com.usman;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
    GamePanel panel;

    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); // this allows it to adjust to the size of the panel automatically
        this.setVisible(true);
        this.setLocationRelativeTo(null); // this allows it to appear at the middle of our screen

    }



}
