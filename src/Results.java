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

                if (GameDisplayForm.getModuleNumber() == 2){
                    GameDisplayForm.setRandomModule(1);


                }
                else if (GameDisplayForm.getModuleNumber() == 1 ){
                    GameDisplayForm.setRandomModule(2);

                }
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
}
