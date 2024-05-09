package DragListener;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();

    MyFrame() {
        this.add(dragPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setTitle("DRAG AND DROP DEMO");
        this.getContentPane().setBackground(Color.BLACK);

        //this.setResizable(false);

        this.setVisible(true);

    }
}
