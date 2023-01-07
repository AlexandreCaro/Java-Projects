import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWithAnonymousClass {

    // Équivalent à AppWithDialog

    private void run(){
        JFrame frame = new JFrame("Hello");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Press me!");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Thank you");
            }
        });

        // Les variables utilisées dans les classes internes sont
        // automatiquement final. C'est le closure.
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AppWithAnonymousClass app = new AppWithAnonymousClass();
        app.run();
    }

}