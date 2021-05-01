import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * This class will display the main GUI, is where the scenario is described and the possible options to respond with
 * are. The frame will include a picture along with 2 buttons so the user can choose how to act.
 *
 * @author Kyle Techentin, Ethan Andujar
 * @version 1.0
 * @since 2021/4/30
 *
 */
public class GameDisplayForm {
    // GUI form objects
    private JButton option2Button;
    private JButton option1Button;
    public JPanel mainDisplayPanel;
    private JLabel scenario;
    private JLabel option1;
    private JLabel option2;
    private JLabel action2;
    private JLabel action1;
    private JTextArea scenarioBody;
    private JLabel score;
    private JTextArea option1TextArea;
    private JTextArea option2TextArea;
    private JLabel displayImage;

    // Total of the score
    public static int gameScore = 0;

    // Image icons so the images can be set on the labels
    private ImageIcon image1 = new ImageIcon();
    private ImageIcon image2 = new ImageIcon();
    private ImageIcon image3 = new ImageIcon();
    private ImageIcon image4 = new ImageIcon();
    private ImageIcon image5 = new ImageIcon();
    private ImageIcon image6 = new ImageIcon();

    // Instantiation of random number generator
    static Random rand = new Random();

    // Variables to figure out how the story progresses
    public static int randomOption;
    public static int branch;
    public static int moduleNumber;

    /**
     *   This method will set all the images, set the code for what happens if a button is hit, and also randomize
     *   what happens a certain button is pressed each time the user runs through the program.
     */
    public GameDisplayForm() {
        scenarioDisplay(IntroPageForm.scenarioNumber, getModuleNumber()); //displays the scenario and options to the user
        image1 = new ImageIcon(this.getClass().getResource("/Images/Scenario1Image.png")); //adds images
        image2 = new ImageIcon(this.getClass().getResource("/Images/Scenario2Image.png")); //adds images
        image3 = new ImageIcon(this.getClass().getResource("/Images/Scenario3Image.png")); //adds images
        image4 = new ImageIcon(this.getClass().getResource("/Images/Lunch.png")); //adds images
        image5 = new ImageIcon(this.getClass().getResource("/Images/boardGame.png")); //adds images
        image6 = new ImageIcon(this.getClass().getResource("/Images/bed.png")); //adds images
        if(moduleNumber == 1) {
            if (IntroPageForm.scenarioNumber == 1) { //determines what image is used and sets the icons
                displayImage.setIcon(image1);
            }
            if (IntroPageForm.scenarioNumber == 2) {
                displayImage.setIcon(image2);
            }
            if (IntroPageForm.scenarioNumber == 3) {
                displayImage.setIcon(image3);
            }
        }
        if(moduleNumber == 2){
            if (IntroPageForm.scenarioNumber == 1) { //determines what image is used and sets the icons
                displayImage.setIcon(image4);
            }
            if (IntroPageForm.scenarioNumber == 2) {
                if(branch == 1){
                    displayImage.setIcon(image5);
                }
                if(branch == 2){
                    displayImage.setIcon(image6);
                }
            }
        }
        option1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //option button 1
                IntroPageForm.option = 1;

                IntroPageForm.myFrame.setContentPane(new OptionInterfaceForm().optionFeedback);
            }
        });
        option2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //option button 2
                IntroPageForm.option = 2;

                IntroPageForm.myFrame.setContentPane(new OptionInterfaceForm().optionFeedback);

            }
        });

    }

    /**
     * This method will generate a random number to see which button houses the correct answer
     */
    public static void setRandomOptions(){ //rolls to see if the options will be swapped
        randomOption = rand.nextInt(2);
    }

    /**
     * method to retrieve the randomOption field that is used to determine which button houses right answer
     *
     * @return a number that controls an if statement for the placement of the correct answer
     */
    public int getRandomOptions(){ //gets randomOption results
        return randomOption;
    }

    /**
     * a method to generate which module will be the first to run
     */
    public static void setRandomModule(){ //rolls to see what module is being used
        moduleNumber = rand.nextInt(2) + 1;
    }

    /**
     * a method that will manually allow the module to be run
     * @param value
     */
    public static void setRandomModule(int value){ //used to manually set the module
        moduleNumber = value;
    }

    /**
     * Gets what module in being ran at the moment
     * @return the current module
     */
    public static int getModuleNumber() {
        return moduleNumber;
    }

    /**
     * the method that sets up th GUI. based on the two params it will decide which module and scenario to be displayed
     * on the GUI. It will also set the main frame to the next frame once it is done with its procedure.
     * @param chooseScenario
     * @param trainingModule
     */
    private void scenarioDisplay(int chooseScenario, int trainingModule) { //sets scenario and option text based on the module
        if (trainingModule == 1) { //scenarios and options of module 1

            if (chooseScenario == 1) { //scenario 1
                scenario.setText("Scenario 1");
                scenarioBody.setText("The class clown, Jimmy, seems to have been unlike himself for the past 2 weeks. " +
                        "You notice him yawning and he seems to be spaced out all day. Usually, he makes jokes nonstop " +
                        "and brightens the mood of the classroom completely. As a fellow classmate, what should you do?");
                if (getRandomOptions() == 0) { //check to see if options have been swapped
                    option1TextArea.setText("You walk up and tell him, that everything will be alright and everything " +
                            "will workout out in the end, no need to worry");
                    option2TextArea.setText("You feel comfortable enough to pull him aside after class and ask him if everything is " +
                            "okay. You also let him know that you are there to listen to him if he needs to talk about anything.");
                }
                if (getRandomOptions() == 1) {
                    option1TextArea.setText("You walk up and tell him, that everything will be alright and everything " +
                            "will workout out in the end, no need to worry");
                    option2TextArea.setText("I don’t know him too well so I feel uncomfortable confronting him about it. If anything" +
                            " he is probably just having some trouble outside of school and he might not want me to talk about it with a stranger.");
                }
            }
            if (chooseScenario == 2) { //scenario 2
                scenario.setText("Scenario 2");
                scenarioBody.setText(" A few days later it is presentation day in your shared class with Jimmy and you notice " +
                        "he seems to be on-edge with his legs bouncing frantically. During his presentation you " +
                        "notice his voice is wavering and he is sweating buckets. After the presentation you see Jimmy quietly" +
                        " slip out of the room without telling the teacher.");
                if (getRandomOptions() == 0) { //check to see if options have been swapped
                    option1TextArea.setText("You ask the teacher if you can go use the restroom so that you can make sure" +
                            " Jimmy isn't doing anything stupid. You see him sitting against a wall and are glad that he " +
                            "is okay and then head to the restroom.");
                    option2TextArea.setText("You slip out as well figuring your presentation is not until tomorrow. You find him " +
                            "sitting against a wall nearby and you ask if you can sit down.");
                }
                if (getRandomOptions() == 1) {
                    option1TextArea.setText("You slip out as well figuring your presentation is not until tomorrow. You find him " +
                            "sitting against a wall nearby and you ask if you can sit down.");
                    option2TextArea.setText("You ask the teacher if you can go use the restroom so that you can make sure" +
                            " Jimmy isn't doing anything stupid. You see him sitting against a wall and are glad that he " +
                            "is okay and then head to the restroom.");
                }
            }
            if (chooseScenario == 3) { //scenario 3
                scenario.setText("Scenario 3");
                scenarioBody.setText(" Later in the day you walk up to Jimmy, asking for his phone number so you guys can" +
                        " stay in contact after school hours. After a week of texting back and forth, he thanks you over " +
                        "text for talking to him that one day when couldn't really concentrate. He admits that he is " +
                        "feeling worried that his family will not " +
                        "be able to pay for him to go to college and those money issues are causing a rift in his family. " +
                        "He is having a difficult time not feeling like he is the reason his family is having a tough " +
                        "time. ");
                if (getRandomOptions() == 0) { //check to see if options have been swapped
                    option1TextArea.setText("You deny that his family would ever think that about him and you tell him " +
                            "that he should not worry about money situations because there are many scholarships available.");
                    option2TextArea.setText("You read his texts about his feelings and once you are done you text him back that you " +
                            "can’t possibly understand what he is going through but you are here for him for when he needs you.");
                }
                if (getRandomOptions() == 1) {
                    option1TextArea.setText("You read his texts about his feelings and once you are done you text him back that you " +
                            "can’t possibly understand what he is going through but you are here for him for when he needs you.");
                    option2TextArea.setText("You deny that his family would ever think that about him and you tell him " +
                            "that he should not worry about money situations because there are many scholarships available.");

                }
            }
        }
        if (trainingModule == 2){ //scenarios and options of module 2
            if (chooseScenario == 1) { //scenario 1
                scenario.setText("Scenario 1");
                scenarioBody.setText("Your best friend Amanda seems to be worrying a lot about her upcoming academic tests." +
                        " While eating lunch with her, you notice her yawning frequently and lacking her usual cheery energy. " +
                        "We hangout every weekend, but Amanda says she can’t because she is really worried about getting " +
                        "good grades on the upcoming tests.");
                if (getRandomOptions() == 0) { //check to see if options have been swapped
                    option1TextArea.setText("You let her know that she can call you if she ever needs a break from " +
                            "studying over the weekend.");
                    option2TextArea.setText("You let her know that you are there to listen to her if she needs to talk " +
                            "about anything.");
                }
                if (getRandomOptions() == 1) {
                    option1TextArea.setText("You let her know that you are there to listen to her if she needs to talk " +
                            "about anything.");
                    option2TextArea.setText("You let her know that she can call you if she ever needs a break from" +
                            " studying over the weekend.");
                }
            }
            if (chooseScenario == 2) { //scenario 2
                if (branch == 1) { //determines scenario direction based on last scenario's option
                    scenario.setText("Scenario 2");
                    scenarioBody.setText(" The weekend after all of Amanda’s tests, she invites you over to her house. " +
                            "You go to her room and notice it is messier than usual. You guys end up playing a board game " +
                            "but when something does not go her way she gets irritated easily which is not like her.");
                    if (getRandomOptions() == 0) { //check to see if options have been swapped
                        option1TextArea.setText("When finished with the game, you offer to help clean her room because a " +
                                " messy environment can decrease a person's mood and productivity.");
                        option2TextArea.setText("When finished with the game, you offer up your ear in case she has " +
                                "something that she needs to talk about.");
                    }
                    if (getRandomOptions() == 1) {
                        option1TextArea.setText("When finished with the game, you offer up your ear in case she has " +
                                "something that she needs to talk about.");
                        option2TextArea.setText("When finished with the game, you offer to help clean her room because a " +
                                " messy environment can decrease a person's mood and productivity.");
                    }
                }
                if (branch == 2) {
                    scenario.setText("Scenario 2");
                    scenarioBody.setText("While at Amanda’s house on the weekend she opens up to you about how she is " +
                            "feeling. She feels like if she does not pass her upcoming tests that she will not be able to " +
                            "get into a good college. Her parents want her to go to Yale and she really wants to live up to " +
                            "their expectations.");
                    if (getRandomOptions() == 0) { //check to see if options have been swapped
                        option1TextArea.setText("Let Amanda know that she should be doing things for herself more than " +
                                "anyone else, live for yourself and make your own decisions.");
                        option2TextArea.setText("You tell her that you can’t possibly understand what she is going through " +
                                "but you are here and willing to listen to her at all times.");
                    }
                    if (getRandomOptions() == 1) {
                        option1TextArea.setText("You tell her that you can’t possibly understand what she is going through " +
                                "but you are here and willing to listen to her at all times.");
                        option2TextArea.setText("Let Amanda know that she should be doing things for herself more than " +
                                "anyone else, live for yourself and make your own decisions.");

                    }
                }
            }
        }
    }
}
