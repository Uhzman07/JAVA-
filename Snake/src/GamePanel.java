import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.Random;
import java.util.Random.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25; // That is how big we want the object on the screen
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE; // This is to calculate the components that can fit in
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS]; // Since this array contains the x coordinates
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten; // Initially zero
    int appleX;// x coordinate of apple
    int appleY;// y coordinate of apple
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;



    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();


    }
    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY,this);// Note that the delay value is the time used as interval and we add this since it is implementing an Action Listener
        timer.start();



    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);

    }
    public void draw(Graphics g){
        if(running){
         // for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) { // Note that a for loop is just used to count digit in ascending order or descending order
              //g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);// since i varies from 0 upward so when we multiply the unit size which is 25 by i the x coordinate changes with a difference in 25
              // since the initial value of i is 0 and the largest number is 24 by calculating 600/25 the numbers increase gradually from 0 to 24 thereby altering the x coordinates of the line
              //g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE); // This is for the horizontal lines across the panel

         // }
          g.setColor(Color.red);
          g.fillOval(appleX,appleY,UNIT_SIZE,UNIT_SIZE);

          for (int i=0; i<bodyParts; i++) {
              if (i == 0) { // this is to give the snake a conditional statement so that the head part is differentiated
                  g.setColor(Color.green);
                  g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // Head of snake

              } else {
                  g.setColor(new Color(45, 180, 0));
                  g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))); // This randomly selects colour code from 0 to 255 for each of the squares created by i there by giving them different colors
                  // This generally gives each new block formed when apple is eaten a random color
                  
                  g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // Body of snake, since i  now  1 to 6, dimensions of x and y  accordingly,represents the how the unit size blocks for the body of the snake one by one

              }
          }
          // To create a font for the score board
          g.setColor(Color.red);
          g.setFont(new Font("Ink Free",Font.BOLD, 40));
          FontMetrics metrics = getFontMetrics(g.getFont());
          g.drawString("Score: " + applesEaten,(SCREEN_WIDTH-metrics.stringWidth("Score: "+ applesEaten))/2,g.getFont().getSize()); // we cant use 0 as the y axis since 0 begins at the base of the font so we just have to get the size of the font

        }
        else{
            gameOver(g);
        }

    }
    public void newApple(){
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE; // This makes the integer range of x to be 0 to 24 that is the screen width / unit size so the number given from 0 to 24 is multiplied by the unit size which is 25 giving the x position
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;

    }
    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;

        }





    }
    public void checkApple(){ // here is when the head of the snake touches the apple
        if((x[0] == appleX) && (y[0] == appleY)){ // these are the x and y coordinates of the snake head
            bodyParts++;
            applesEaten++;
            newApple();
        }

    }
    public void checkCollision(){
        // checks if head collides with the body
        for(int i =bodyParts; i>0; i--){
            if((x[0] == x[i]) && (y[0] == y[i])){ // the x[0] and y[0] represents the first array for the head position while the x[i] and y[i] represents the body of the snake
                running = false;
            }
        }
        // Check if the head touches the left border
        if (x[0] < 0) {
            running = false;
        }
        
        // Check if the head touches the right border
        if(x[0] > SCREEN_WIDTH) {
            running = false;
        // Check if the head touches the top border


        }
        if(!running){
            timer.stop();

        }

    }
    public void gameOver(Graphics g){
        // Displays the score at the end also after the Game Over
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD, 40));
        FontMetrics metrics1= getFontMetrics(g.getFont());
        g.drawString("Score: " + applesEaten,(SCREEN_WIDTH-metrics1.stringWidth("Score: "+ applesEaten))/2,g.getFont().getSize()); // we cant use 0 as the y axis since 0 begins at the base of the font so we just have to get the size of the font


        //Game over text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics metrics2 = getFontMetrics(g.getFont()); // This is used to get the dimension of the font naturally without calculating
        g.drawString("Game Over",(SCREEN_WIDTH-metrics2.stringWidth("Game Over"))/2,SCREEN_HEIGHT/2); // since we cannot tell the dimension the designed string will give, we will have to use a screen metric to do it

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){ // that is if the game is running
            move();
            checkApple();
            checkCollision();


        }
        repaint(); // it is outside the running loop since we want a repaint when the game is done running

    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if(direction != 'R') { // this is just to prevent  180 degree turning
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L') { // this is to prevent 180 degree turning from left
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'U') {
                        direction = 'D';
                    }
                    break;




                }



            }

        }

}
