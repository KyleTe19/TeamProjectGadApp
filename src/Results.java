import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class established the results GUI form which is brought up when the user finishes a full scenario.
 * Displays their final score for that scenario and provides a link to some more information.
 *
 * @author Kyle Techentin, Harrison Fagg
 * @version 1.0
 * @since 2021/4/30
 */
public class Results {
    // Results GUI frame objects
    public JPanel resultsPanel;
    private JLabel scoreLabel;
    private JTextField textField;
    public JButton replay;
    private JButton exitButton;

    // Tracking how many times the program is reset
    public static int resetCount;

    /**
     * This class is just house the two buttons in the results GUI, update the score,
     * and ser the main frame to another panel when done.
     */
    public Results(){
        // Setting the score label
        scoreLabel.setText(String.valueOf(GameDisplayForm.gameScore) +"/3000");


        replay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // This code runs if
                if (resetCount < 1 ) {

                    // This checks to see which module is running and switches it to the other if the user replays
                    if (GameDisplayForm.getModuleNumber() == 2) {
                        GameDisplayForm.setRandomModule(1);

                    }
                    if (GameDisplayForm.getModuleNumber() == 1) {
                        GameDisplayForm.setRandomModule(2);


                    }
                    // This is so we know how many times the program has be replayed
                    resetCount++;

                    //Rest the info so user can play again
                    IntroPageForm.scenarioNumber = 1;
                    GameDisplayForm.gameScore = 0;
                    IntroPageForm.myFrame.setContentPane(new GameDisplayForm().mainDisplayPanel);
                }
                // Doesn't let the user restart the program again if they already went through both scenarios
                else{
                    JOptionPane.showMessageDialog(null, "Sorry! No more scenarios are available. Click th exit button" +
                            " instead. Thanks for playing!");
                    // So they can't replay, no matter what
                    replay.setEnabled(false);
                }
            }
        });
        // Closes the program
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }

    // Sets the text field that houses the link to non editable, but allows them to highlight it.
    public void nonEditField(){
        textField.setEditable(false);

    }
}
