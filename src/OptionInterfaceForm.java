import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionInterfaceForm {
    public JPanel optionFeedback;
    private JButton clickToContinueButton;
    private JTextArea firstFeedbackLine;
    private JTextArea secondFeedbackLine;
    private JTextArea thirdFeedbackLine;
    private JTextArea fourthFeedbackLine;
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
                    firstFeedbackLine.setText("1");
                    secondFeedbackLine.setText("");
                    thirdFeedbackLine.setText("");
                    fourthFeedbackLine.setText("");
                    break;
                case 2:
                    firstFeedbackLine.setText("2");
                    secondFeedbackLine.setText("");
                    thirdFeedbackLine.setText("");
                    fourthFeedbackLine.setText("");
                    break;
                case 3:
                    firstFeedbackLine.setText("3");
                    secondFeedbackLine.setText("");
                    thirdFeedbackLine.setText("");
                    fourthFeedbackLine.setText("");
                    break;
                case 4:
                    firstFeedbackLine.setText("4");
                    secondFeedbackLine.setText("");
                    thirdFeedbackLine.setText("");
                    fourthFeedbackLine.setText("");
                    break;
            }
        }
        if (option == 2) {
            switch (scenario) {
                case 1:
                    firstFeedbackLine.setText("5");
                    secondFeedbackLine.setText("");
                    thirdFeedbackLine.setText("");
                    fourthFeedbackLine.setText("");
                    break;
                case 2:
                    firstFeedbackLine.setText("6");
                    secondFeedbackLine.setText("");
                    thirdFeedbackLine.setText("");
                    fourthFeedbackLine.setText("");
                    break;
                case 3:
                    firstFeedbackLine.setText("7");
                    secondFeedbackLine.setText("");
                    thirdFeedbackLine.setText("");
                    fourthFeedbackLine.setText("");
                    break;
                case 4:
                    firstFeedbackLine.setText("8");
                    secondFeedbackLine.setText("");
                    thirdFeedbackLine.setText("");
                    fourthFeedbackLine.setText("");
                    break;
            }
        }
    }
}
