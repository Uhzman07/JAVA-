package JComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String [] animals = {"dog", "cat", "bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);


        //comboBox.setEditable(true);// this makes the text box editable
        // System.out.println(comboBox.getItemCount()); // this prints out the number of items
        //comboBox.addItem("Horse"); // this adds an object to the comboBox
        //comboBox.insertItemAt("parrot",0); // this replaces a certain a item with an item with a certain position
        // comboBox.setSelectedIndex(0); // this is used to set the default item showed in the text box as the item whose position is indicated
        //comboBox.removeItem("cat"); // this removes the input item from the options of the combo box
        //comboBox.removeItemAt(0); // this removes the item whose position is given
        // comboBox.removeAll(); // this removes all the items
















        this.add(comboBox);
        this.pack();
        this.setVisible(true);



    }














    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox){
            //System.out.println(comboBox.getSelectedItem()); // this prints out the selected item
            System.out.println(comboBox.getSelectedIndex()); // this prints out the position of the item selected

        }

    }
}
