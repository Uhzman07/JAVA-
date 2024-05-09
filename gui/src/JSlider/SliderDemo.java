package JSlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JPanel panel;
    JFrame frame;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25); // Note that the above stated minimum, maximum and default values naturally all take a major tick

        slider.setPaintLabels(true); // this gives it the permission to show the label components around the slider like the texts

        slider.setFont(new Font("Times New Roman", Font.BOLD, 15));

        label.setFont(new Font("MV Boli" , Font.BOLD, 25));

        // slider.setOrientation(SwingConstants.HORIZONTAL); // this changes the slider orientation to horizontal
        slider.setOrientation(SwingConstants.VERTICAL); // this changes the slider orientation to

        label.setText("TEMPERATURE =" + slider.getValue() + "*C");
        slider.addChangeListener(this);

        slider.setBackground(Color.cyan);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("TEMPERATURE =" + slider.getValue() + "*C");// this allows the slider to listen to chane in the slider

    }
}
