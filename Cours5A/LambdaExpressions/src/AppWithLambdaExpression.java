import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWithLambdaExpression {

    // Équivalent à AppWithDialog

    private void run(){
        JFrame frame = new JFrame("Hello");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Press me!");
        button.addActionListener( // Lambda Expression
                (e) -> JOptionPane.showMessageDialog(frame, "Thank you"+e.getModifiers())
        );

        // Les variables utilisées dans les classes internes sont
        // automatiquement final. C'est le closure.
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AppWithLambdaExpression app = new AppWithLambdaExpression();
        app.run();
    }

}