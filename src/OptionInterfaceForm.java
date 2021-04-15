import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionInterfaceForm {
    public JPanel optionFeedback;
    private JButton clickToContinueButton;
    private JLabel FirstFeedbackLine;
    private JLabel SecondFeedbackLine;
    private JLabel ThirdFeedbackLine;
    private JLabel FourthFeedbackLine;
    public static JFrame myFrame;

    public OptionInterfaceForm() {
        clickToContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame = new JFrame("");
                myFrame.setContentPane(new GameDisplayForm().mainDisplay);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setPreferredSize(new Dimension(1000, 600));
                myFrame.pack();
                myFrame.setVisible(true);

            }
        });
    }
}
