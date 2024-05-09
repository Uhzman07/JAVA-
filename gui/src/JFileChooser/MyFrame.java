package JFileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select file");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();

            // In order to change the directory of the file chooser that is where we want the file chooser to search
            //fileChooser.setCurrentDirectory(new File("."));// This makes the file directory to be our current project folder since the dot is its path name
            fileChooser.setCurrentDirectory(new File("C:\\Users\\Nafis\\OneDrive\\Desktop")); // This shows the files in the desktop since we have copied its location path here

            /*
             fileChooser.showOpenDialog(null); // This shows all files so we can select to open and the parent component is null since we dont want to add any component
            // it can also be
            fileChooser.showSaveDialog(null); // This shows all files so we can select to save
             */



            // TO GET THE RESPONSE ON THE TERMINAL
           /* System.out.println(fileChooser.showOpenDialog(null));
           if we select a particular file, we see 0 on the terminal
           if we press cancel we get 1 on the terminal
           if we press exit, we get 1 on the terminal
            */

            //     OR

            int response = fileChooser.showOpenDialog(null);
            //int response = fileChooser.showSaveDialog(null);

            if(response == fileChooser.APPROVE_OPTION) { // this means if the file has been successfully selected using the file chooser
                // another way of writing this is ; if(response == 0) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file); // this outputs the absolute path of the  that was opened using the file CHOOSER
            }


        }

    }
}
