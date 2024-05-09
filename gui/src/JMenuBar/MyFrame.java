package JMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem exitItem;
    JMenuItem saveItem;
    JMenuItem loadItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("Cancel.png");

        menuBar = new JMenuBar(); // this is used to create the menu bar space

        fileMenu = new JMenu("File"); // the JMenu is used to create a menu in the menu bar
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("load"); // the JMenuItem are like a sub_class to each JMenu when we click on them
        saveItem = new JMenuItem("save");
        exitItem = new JMenuItem("exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        // The setMnemonic is used to add key shortcuts to instances

        fileMenu.setMnemonic(KeyEvent.VK_F);// Alt+f for file // since alt is immediately after the comment lines it works well
        editMenu.setMnemonic(KeyEvent.VK_E);// Alt+e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);// Alt+h for help
        loadItem.setMnemonic(KeyEvent.VK_L);// l for load
        saveItem.setMnemonic(KeyEvent.VK_S);// s for save
        exitItem.setMnemonic(KeyEvent.VK_E);// e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar); // We must add the JMenuBar to the frame

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem) {
            System.out.println("You loaded a file");
        }
        if(e.getSource() == saveItem) {
            System.out.println("You saved a file");
        }
        if(e.getSource()== exitItem) {
            System.exit(0); // this is used to exit the current application
        }

    }
}
