import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionInterfaceForm {
    public JPanel optionFeedback;
    private JButton clickToContinueButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JLabel optionImage;
    private JLabel Title;
    private ImageIcon image1 = new ImageIcon();
    private ImageIcon image2 = new ImageIcon();

    public OptionInterfaceForm() {
        optionInterface(IntroPageForm.scenarioNumber, IntroPageForm.option, GameDisplayForm.randomOption, GameDisplayForm.moduleNumber, GameDisplayForm.branch); //displays option results

        IntroPageForm.scenarioNumber++; //scenario counter

        image1 = new ImageIcon(this.getClass().getResource("/Images/AlmostThere.png")); //adds images
        image2 = new ImageIcon(this.getClass().getResource("/Images/ThumbsUp.png")); //adds images

        if(GameDisplayForm.randomOption == 0) { //changes option icon based on if the options were swapped
            if (IntroPageForm.option == 1) {
                optionImage.setIcon(image1);
            }
            if (IntroPageForm.option == 2) {
                optionImage.setIcon(image2);
            }
        }
        if(GameDisplayForm.randomOption == 1){ //changes option icon based on if the options were swapped
            if (IntroPageForm.option == 1){
                optionImage.setIcon(image2);
            }
            if (IntroPageForm.option == 2) {
                optionImage.setIcon(image1);
            }
        }
        clickToContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameDisplayForm.setRandomOptions(); //randomly determines if the options are swapped
                IntroPageForm.myFrame.setContentPane(new GameDisplayForm().mainDisplayPanel);
                if(GameDisplayForm.getModuleNumber() == 1) //cuts off module 1 after 3 scenarios
                    if (IntroPageForm.scenarioNumber == 4){
                        IntroPageForm.myFrame.setContentPane(new Results().resultsPanel); //runs results
                    }
                if(GameDisplayForm.getModuleNumber() == 2) //cuts off module 2 after 2 scenarios
                    if (IntroPageForm.scenarioNumber == 3){
                        IntroPageForm.myFrame.setContentPane(new Results().resultsPanel); //runs results
                    }
            }
        });
    }
    public void optionInterface(int scenario, int option, int random, int module, int branch) { //informs user the results of their choice
        int result;
        if((option + random) % 2 == 0){ //determines if the options have been swapped
            result = 0; //no change
        }
        else{
            result = 1; //yes change
        }
        if(module == 1) { //module 1 is being used
            if (result == 1) {
                switch (scenario) { //determines what scenario is used
                    case 1:
                        textArea1.setText("It is important to recognize mental health issues even in individuals who you are not very close with. If unrecognized by anyone, mental health conditions can become harder to gain control of. One of the symptoms of many mental health conditions is lack of sleep which induces tiredness. This then will lead to having difficulty concentrating/ seeming spaced out. ");
                        textArea2.setText("One thing to keep in mind is that anxiety is very common among adolescents and" +
                                " children. 7.1% of children aged 3-17 years (approximately 4.4 million) have diagnosed " +
                                "anxiety. Its a very normal thing which is why education on it are so important! ");
                        GameDisplayForm.gameScore += 500;
                        break;
                    case 2:
                        textArea1.setText("Being on edge and restless is an indication for multiple different mental health disorders. It is best to not assume that someone is okay based on only your experience with other individuals who have difficulty with certain projects at school. ");
                        textArea2.setText("");
                        GameDisplayForm.gameScore += 500;
                        break;
                    case 3:
                        textArea1.setText("Excessive worry and family problems can increase mental health conditions. Generalized Anxiety Disorder develops slowly and often starts in the teen years. Both children and adults with GAD may experience physical symptoms that make it hard to function and that interfere with daily life. So, if this mental health condition were to continue without any recognition, then it would be more difficult to help as a mental health first aider.");
                        textArea2.setText("A website with more information: https://www.nimh.nih" +
                                ".gov/health/publications/generalized-anxiety-disorder-gad/index.shtml");
                        GameDisplayForm.gameScore += 500;
                        break;
                }
            }
            if (result == 0) {
                switch (scenario) { //determines what scenario is used
                    case 1:
                        textArea1.setText("Good choice! You were able to understand that something was wrong with your classmate and decided to talk to them despite not having a very close friendship. The first step as a mental health first aider is identifying a potential problem in an individual. Be sure that you are prepared to listen because oftentimes the best thing you can do is just be someone that the affected person can talk to. ");
                        textArea2.setText("One thing to keep in mind is that anxiety is very common among adolescents and" +
                                " children. 7.1% of children aged 3-17 years (approximately 4.4 million) have diagnosed " +
                                " anxiety. Its a very normal thing which is why education on it are so important!");
                        GameDisplayForm.gameScore += 1000;

                        break;
                    case 2:
                        textArea1.setText("Good Job! You recognized that the individual was possibly being affected by anxiety. He showed signs of restlessness and being on edge, which can be major signs of anxiety. Whether he accepts your invitation to sit with him or not, he knows that you are concerned. This might open up more opportunities to share.");
                        textArea2.setText("");
                        GameDisplayForm.gameScore += 1000;
                        break;
                    case 3:
                        textArea1.setText("Good job! You recognized that it was important to not attempt to fix the individual’s problems. You understood that letting the individual know that you are available to listen to their problems was the best that you could do under these circumstances. It is important to be sensitive to what an individual with anxiety is going through, even if it doesn’t make sense to you. Be open for when he reaches out to you again in the future.");
                        textArea2.setText("A website with more information: https://www.nimh.nih" +
                                ".gov/health/publications/generalized-anxiety-disorder-gad/index.shtml");
                        GameDisplayForm.gameScore += 1000;
                        break;
                }
            }
        }
        if(module == 2){ // module 2 is being used
            if (result == 1) {
                switch (scenario) { //determines what scenario is used
                    case 1:
                        textArea1.setText("Excessive worrying about events in the future and sleep problems are common signs of GAD. You are there for your friend, but brushed past the warning signs.of GAD without even realizing it.");
                        textArea2.setText("Excessive worrying and trouble sleeping are two common signs of GAD, but don’t worry since it is still early on for Amanda although the earlier GAD is detected, the better. ");
                        GameDisplayForm.gameScore += 500;
                        GameDisplayForm.branch = 1;
                        break;
                    case 2: //determines direction the scenario branches
                        if(branch == 1) {
                            textArea1.setText("Irritability is a common sign of GAD. Telling someone with a mental health disorder what to do to fix their life and problems is not the best way to help them.");
                            textArea2.setText("Letting your friend know that you are available to talk to them is the best way to let them know you are there for them.");
                            GameDisplayForm.gameScore += 500;
                            break;
                        }
                        if(branch == 2){
                            textArea1.setText("Feeling this anxiety towards herself and her future is a common sign of GAD. It may seem like common emotions but once it becomes excessive, it is important to notice.");
                            textArea2.setText("Also, children who have parents with an anxiety disorder are more likely to have GAD. Amanda’s parents wanting her to go to a prestigious college when that is so far into the future may indicate that they also have an anxiety disorder.");
                            GameDisplayForm.gameScore += 500;
                            break;
                        }
                }
            }
            if (result == 0) {
                switch (scenario) { //determines what scenario is used
                    case 1:
                        textArea1.setText("You were able to recognize two common signs of GAD which are excessive worry and sleep problems. Be sure that you are prepared to listen because oftentimes the best thing you can do is just be someone that the person can talk to.");
                        textArea2.setText("");
                        GameDisplayForm.gameScore += 1000;
                        GameDisplayForm.branch = 2;
                        break;
                    case 2://determines direction the scenario branches
                        if(branch == 1) {
                            textArea1.setText("You recognized that irritability is a common sign of GAD. Also, worries and lack of concentration can lead to not focusing on your basic needs like brushing your teeth or having a clean environment to relax in.");
                            textArea2.setText("");
                            GameDisplayForm.gameScore += 1000;
                            break;
                        }
                        if(branch == 2){
                            textArea1.setText("You understand that your friend’s emotions are something you cannot fix, but being there to listen to her is the best choice.");
                            textArea2.setText("This excessive worrying about her future when it is so far away is a sign of GAD.");
                            GameDisplayForm.gameScore += 1000;
                            break;
                        }
                }
            }
        }
    }
}
