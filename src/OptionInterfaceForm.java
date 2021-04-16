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
                optionInterface(IntroPageForm.scenarioNumber, IntroPageForm.option);
                myFrame = new JFrame("");
                myFrame.setContentPane(new GameDisplayForm().mainDisplay);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setPreferredSize(new Dimension(1000, 600));
                myFrame.pack();
                myFrame.setVisible(true);

                IntroPageForm.scenarioNumber++;

            }
        });
    }
    public void optionInterface(int scenario, int option) {
        if (option == 1)
        {
            switch (scenario){
                case 1:
                    FirstFeedbackLine.setText("1");
                    SecondFeedbackLine.setText("");
                    ThirdFeedbackLine.setText("");
                    FourthFeedbackLine.setText("");
                    break;
                case 2:
                    FirstFeedbackLine.setText("2");
                    SecondFeedbackLine.setText("");
                    ThirdFeedbackLine.setText("");
                    FourthFeedbackLine.setText("");
                    break;
                case 3:
                    FirstFeedbackLine.setText("3");
                    SecondFeedbackLine.setText("");
                    ThirdFeedbackLine.setText("");
                    FourthFeedbackLine.setText("");
                    break;
                case 4:
                    FirstFeedbackLine.setText("4");
                    SecondFeedbackLine.setText("");
                    ThirdFeedbackLine.setText("");
                    FourthFeedbackLine.setText("");
                    break;
            }
        }
        if (option == 2) {
            switch (scenario) {
                case 1:
                    FirstFeedbackLine.setText("5");
                    SecondFeedbackLine.setText("");
                    ThirdFeedbackLine.setText("");
                    FourthFeedbackLine.setText("");
                    break;
                case 2:
                    FirstFeedbackLine.setText("6");
                    SecondFeedbackLine.setText("");
                    ThirdFeedbackLine.setText("");
                    FourthFeedbackLine.setText("");
                    break;
                case 3:
                    FirstFeedbackLine.setText("7");
                    SecondFeedbackLine.setText("");
                    ThirdFeedbackLine.setText("");
                    FourthFeedbackLine.setText("");
                    break;
                case 4:
                    FirstFeedbackLine.setText("8");
                    SecondFeedbackLine.setText("");
                    ThirdFeedbackLine.setText("");
                    FourthFeedbackLine.setText("");
                    break;
            }
        }
    }
}
