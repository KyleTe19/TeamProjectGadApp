import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameDisplayForm {
    private JButton option2Button;
    private JButton option1Button;
    public JPanel mainDisplay;
    private JLabel scenario;
    private JLabel option1;
    private JLabel option2;
    private JLabel action2;
    private JLabel action1;
    private JLabel scenarioBody;
    private JLabel score;
    public static JFrame myFrame;


    public GameDisplayForm() {

        option1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame = new JFrame("Option 1");
                myFrame.setContentPane(new OptionInterfaceForm().optionFeedback);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setPreferredSize(new Dimension(1000, 600));
                myFrame.pack();
                myFrame.setVisible(true);

            }
        });
        option2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame = new JFrame("Option 2");
                myFrame.setContentPane(new OptionInterfaceForm().optionFeedback);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setPreferredSize(new Dimension(1000, 600));
                myFrame.pack();
                myFrame.setVisible(true);

            }
        });

    }
    //public void optionInterface()
    private void scenarioDisplay(int scenarioNumber){
        if(scenarioNumber == 1){
            scenarioBody.setText("The class clown, Jimmy, in your class seems to be unlike himself for the past 2 weeks. You notice him yawning and he seems to be spaced out all day. Usually, he makes jokes nonstop and brightens the moods of everyone around the room. As a concerned classmate, what should you do?");
            option1.setText("I don’t know him too well so I feel uncomfortable confronting him about it. If anything he is probably just having some trouble outside of school and he might not want me to talk about it with a stranger.");
            option2.setText("You feel comfortable enough to pull him aside after class and ask him if everything is okay. You also let him know that you are there to listen to him if he needs to talk about anything.");
        }
        if(scenarioNumber == 2){
            scenarioBody.setText(" A few days later it is presentation day in your shared class with Jimmy and you notice him seeming to be on-edge and his knee bouncing up and down rapidly. During his presentation you notice his voice is wavering and he is sweating buckets. After the presentation you see Jimmy quietly slip out of the room without telling the teacher.");
            option1.setText("You decide to do nothing because your presentation is tomorrow and you really need to get a good grade on it. You need to see how other presentations are going because you are nervous about yours tomorrow. Also, it is common for people to get a bit worried before a presentation.");
            option2.setText("You slip out as well figuring your presentation is not until tomorrow. You find him sitting against a wall nearby and you ask if you can sit down.");
        }
        if (scenarioNumber == 3){
            scenarioBody.setText(" Later in the day you walk up to Jimmy, asking for his phone number to stay in contact after school hours. After a week of texting back and forth, he thanks you over text for talking to him that one day when he was having difficulty concentrating. He admits that he has been worried about being too much of a show off at school lately and it has caused him to get less sleep and he has also been feeling irritated. He is feeling worried that his family will not be able to pay for him to go to college and those money issues are causing a rift in his family. He is having difficulty controlling his worries that he is the reason his family is having a tough time. ");
            option1.setText("You deny that he is a show off and you tell him that he should not worry about money situations because there are many scholarships available.");
            option2.setText("You read his texts about his feelings and once you are done you text him back that you can’t possibly understand what he is going through but you are here for him for when he needs you.");
        }

    }


}
