import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Results {
    public JPanel resultsPanel;
    private JLabel scoreLabel;
    private JTextField textField;
    private JButton replay;
    private JButton exitButton;
    private int resetCount;

    public Results(){
        scoreLabel.setText(String.valueOf(GameDisplayForm.gameScore) +"/3000");
       // endingMessage(IntroPageForm.scenarioNumber);


        replay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (GameDisplayForm.getModuleNumber() == 1){
                    GameDisplayForm.setRandomModule(0);


                }
                else if (GameDisplayForm.getModuleNumber() == 0 ){
                    GameDisplayForm.setRandomModule(1);

                }
                replay.setEnabled(false);
                resetCount++;
                System.out.println("How many resets" + resetCount);
                IntroPageForm.scenarioNumber = 1;
                GameDisplayForm.gameScore = 0;
                IntroPageForm.myFrame.setContentPane(new GameDisplayForm().mainDisplayPanel);




            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }


    public void nonEditField(){
        textField.setEditable(false);

    }
    private void endingMessage(int scenarioNumber){
        if(GameDisplayForm.gameScore == 3000 && scenarioNumber > 3){
            JOptionPane.showInputDialog(null, "Great Job! you handled all of the scenarios perfectly and helped your " +
                    "classmate feel better/ not feel alone in this world. The application will now exit, we hope " +
                    "this training will help you in the future or at least make you realize how common mental health " +
                    "conditions are!");
            JOptionPane.showInputDialog(null, "The program will now terminate");
            System.exit(0);

        }
        else if (GameDisplayForm.gameScore >= 1500 && GameDisplayForm.gameScore < 3000 && scenarioNumber > 3){
            JOptionPane.showMessageDialog(null, "Good Job! you may not have handled all the scenarios with the ideal " +
                    "response but that is perfectly fine! From this scenario you learned about interacting with " +
                    "people who may have a mental health condition.");
            JOptionPane.showMessageDialog(null, "The program will now terminate");
            System.exit(0);
        }
        else{

        }

    }
}
