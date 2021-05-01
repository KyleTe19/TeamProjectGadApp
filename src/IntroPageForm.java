import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is for setting up the entire program, initializes randomization and other variables.
 * It also sets up the main display form after the user hits the begin button. Also creates the
 * Intro GUI form.
 *
 * @author Kyle Techentin, Ethan Andujar
 * @version 1.0
 * @since 2021/4/30
 *
 */
public class IntroPageForm {
    //Instantiation of the frame that is used throughout the app
    public static JFrame myFrame = new JFrame ("This is a Generalized Anxiety Training Simulation");

    // THe specific panel for the welcome page
    public JPanel welcomeForm;

    // GUI components of the welcome page
    private JButton clickToStartButton;
    private JTextArea introPageBody;
    private JLabel image;

    // Variables for figuring out which exact text should be set on the GUI
    public static int scenarioNumber = 1;
    public static int option;

    private ImageIcon introImage = new ImageIcon(); // Allows for images to be used

    public IntroPageForm() {
        // Getting location of folder so everyone who runs it can call the images
        image = new JLabel(String.valueOf(this.getClass().getResource("/images/Anxiety.png")));
        image.setIcon(introImage);

        clickToStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Randomizing which module starts and which options are on each button
                GameDisplayForm.setRandomOptions();
                GameDisplayForm.setRandomModule();

                // Changing the frame
                myFrame.setContentPane(new GameDisplayForm().mainDisplayPanel);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setPreferredSize(new Dimension(1000, 800));
                myFrame.pack();
                myFrame.setVisible(true);




            }
        });
    }
    public static void main(String[] args) {
        //JFrame myFrame = new JFrame ("This is a Generalized Anxiety Training Simulation"); // Makes the frame
        myFrame.setContentPane(new IntroPageForm().welcomeForm); // attaches the panel to the frame
        myFrame.requestFocusInWindow();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setPreferredSize(new Dimension(1000,800));
        myFrame.setResizable(true);

        myFrame.pack(); // puts all components into the frame
        myFrame.setVisible(true); // allows the frame to be seen
    }
}
