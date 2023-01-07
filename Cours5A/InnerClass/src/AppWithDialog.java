import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleButtonActionListener implements ActionListener{
    private AppWithDialog app;

    public SimpleButtonActionListener(AppWithDialog app){
        this.app = app;
    }


    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(app.frame, "Thank you");
    }
}

public class AppWithDialog {

    JFrame frame;

    private void run(){
        frame = new JFrame("Hello");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Press me!");
        button.addActionListener(new SimpleButtonActionListener(this));
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AppWithDialog app = new AppWithDialog();
        app.run();
    }

}
