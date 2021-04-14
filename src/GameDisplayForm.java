import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameDisplayForm {
    private JPanel panel1;
    private JButton option2Button;
    private JButton option1Button;

    public GameDisplayForm() {
        option1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        option2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame ("This is a Generalized Anxiety Training Simulation"); // Makes the frame
        myFrame.setContentPane(new GameDisplayForm().panel1); // attaches the panel to the frame

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setPreferredSize(new Dimension(1000,600));
        myFrame.setResizable(true);

        myFrame.pack(); // puts all components into the frame
        myFrame.setVisible(true); // allows the frame to be seen
    }
}
