import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWithDialog {

    class SimpleButtonActionListener implements ActionListener{

        JFrame frame;

        SimpleButtonActionListener(JFrame frame){
            this.frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(frame, "Thank you");
        }
    }

    private void run(){
        JFrame frame = new JFrame("Hello");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Press me!");
        button.addActionListener(new SimpleButtonActionListener(frame));
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AppWithDialog app = new AppWithDialog();
        app.run();
    }

}