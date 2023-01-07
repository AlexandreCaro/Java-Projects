// Observer/ Observable design patterns

import javax.swing.*;

public class SimpleApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello"); // Create a window
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a button and add it to the window

        JButton button = new JButton("Press me!");
        frame.add(button);

        frame.setVisible(true); // Make the window visible
    }
}
