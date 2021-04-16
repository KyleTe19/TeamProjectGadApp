import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroPageForm {
    public JPanel welcomeForm;
    private JButton clickToStartButton;
    public static JFrame myFrame;
    public static int scenarioNumber;
    public static int option;

    public IntroPageForm() {
        clickToStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.setContentPane(new GameDisplayForm().mainDisplay);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setPreferredSize(new Dimension(1000, 600));
                myFrame.pack();
                myFrame.setVisible(true);

                scenarioNumber = 1;

            }
        });
    }
    public static void main(String[] args) {
        JFrame myFrame = new JFrame ("This is a Generalized Anxiety Training Simulation"); // Makes the frame
        myFrame.setContentPane(new IntroPageForm().welcomeForm); // attaches the panel to the frame
        myFrame.requestFocusInWindow();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setPreferredSize(new Dimension(1000,600));
        myFrame.setResizable(true);

        myFrame.pack(); // puts all components into the frame
        myFrame.setVisible(true); // allows the frame to be seen
    }
}
