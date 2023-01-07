import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWithInnerClass {

    JFrame frame;

    class SimpleButtonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(frame, "Thank you");
        }
    }

    private void run(){
        frame = new JFrame("Hello");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Press me!");
        button.addActionListener(new SimpleButtonActionListener());
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AppWithInnerClass app = new AppWithInnerClass();
        app.run();
    }

}
