import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameDisplayForm {
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
    public static int gameScore = 0;
    private ImageIcon image1 = new ImageIcon();
    private ImageIcon image2 = new ImageIcon();
    private ImageIcon image3 = new ImageIcon();
    static Random rand = new Random();
    public static int randomOption;

    public GameDisplayForm() {

        System.out.println(IntroPageForm.scenarioNumber);
        scenarioDisplay(IntroPageForm.scenarioNumber);
        image1 = new ImageIcon(this.getClass().getResource("/Images/Scenario1Image.png"));
        image2 = new ImageIcon(this.getClass().getResource("/Images/Scenario2Image.png"));
        image3 = new ImageIcon(this.getClass().getResource("/Images/Scenario3Image.png"));
        if (IntroPageForm.scenarioNumber == 1){
            displayImage.setIcon(image1);
        }
        if (IntroPageForm.scenarioNumber == 2){
            displayImage.setIcon(image2);
        }
        if (IntroPageForm.scenarioNumber == 3){
            displayImage.setIcon(image3);
        }
        option1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IntroPageForm.option = 1;

                IntroPageForm.myFrame.setContentPane(new OptionInterfaceForm().optionFeedback);
            }
        });
        option2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IntroPageForm.option = 2;

                IntroPageForm.myFrame.setContentPane(new OptionInterfaceForm().optionFeedback);

            }
        });

    }
    public static void setRandomOptions(){
        randomOption = rand.nextInt(2);
    }

    public int getRandomOptions(){
        return randomOption;
    }

    private void scenarioDisplay(int chooseScenario){
        if(chooseScenario == 1){
            scenario.setText("Scenario 1");
            scenarioBody.setText("The class clown, Jimmy, seems to have been unlike himself for the past 2 weeks. " +
                    "You notice him yawning and he seems to be spaced out all day. Usually, he makes jokes nonstop " +
                    "and brightens the mood of the classroom completely. As a fellow classmate, what should you do?");
            if(getRandomOptions() == 0){
                option1TextArea.setText("You walk up and tell him, that everything will be alright and everything " +
                        "will workout out in the end, no need to worry");
                option2TextArea.setText("You feel comfortable enough to pull him aside after class and ask him if everything is " +
                        "okay. You also let him know that you are there to listen to him if he needs to talk about anything.");
            }
            if(getRandomOptions() == 1){
                option1TextArea.setText("You walk up and tell him, that everything will be alright and everything " +
                        "will workout out in the end, no need to worry");
                option2TextArea.setText("I don’t know him too well so I feel uncomfortable confronting him about it. If anything" +
                        " he is probably just having some trouble outside of school and he might not want me to talk about it with a stranger.");
            }
        }
        if(chooseScenario == 2) {
            scenario.setText("Scenario 2");
            scenarioBody.setText(" A few days later it is presentation day in your shared class with Jimmy and you notice " +
                    "he seems to be on-edge with his legs bouncing frantically. During his presentation you " +
                    "notice his voice is wavering and he is sweating buckets. After the presentation you see Jimmy quietly" +
                    " slip out of the room without telling the teacher.");
            if (getRandomOptions() == 0) {
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
        if (chooseScenario == 3){
            scenario.setText("Scenario 3");
            scenarioBody.setText(" Later in the day you walk up to Jimmy, asking for his phone number so you guys can" +
                    " stay in contact after school hours. After a week of texting back and forth, he thanks you over " +
                    "text for talking to him that one day when couldn't really concentrate. He admits that he is " +
                    "feeling worried that his family will not " +
                    "be able to pay for him to go to college and those money issues are causing a rift in his family. " +
                    "He is having a difficult time not feeling like he is the reason his family is having a tough " +
                    "time. ");
            if (getRandomOptions() == 0) {
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
}
