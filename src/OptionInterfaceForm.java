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
        optionInterface(IntroPageForm.scenarioNumber, IntroPageForm.option, GameDisplayForm.randomOption);

        IntroPageForm.scenarioNumber++;

        image1 = new ImageIcon(this.getClass().getResource("/Images/AlmostThere.png"));
        image2 = new ImageIcon(this.getClass().getResource("/Images/ThumbsUp.png"));

        if(GameDisplayForm.randomOption == 0) {
            if (IntroPageForm.option == 1) {
                optionImage.setIcon(image1);
            }
            if (IntroPageForm.option == 2) {
                optionImage.setIcon(image2);
            }
        }
        if(GameDisplayForm.randomOption == 1){
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
                GameDisplayForm.setRandomOptions();

                IntroPageForm.myFrame.setContentPane(new GameDisplayForm().mainDisplayPanel);

                if (IntroPageForm.scenarioNumber == 4){
                    IntroPageForm.myFrame.setContentPane(new Results().resultsPanel);
                }

            }
        });
    }
    public void optionInterface(int scenario, int option, int random) {
        int result;
        if((option + random) % 2 == 0){
            result = 0;
        }
        else{
            result = 1;
        }
        if (result == 1) {
            switch (scenario){
                case 1:
                    Title.setText("Feedback 1");
                    textArea1.setText("It is important to recognize mental health issues even in individuals who you are" +
                            " not very close with. If unrecognized by anyone, mental health conditions can become harder" +
                            " to gain control of. One of the symptoms of many mental health conditions is lack of sleep " +
                            "which induces tiredness. Which could lead to difficulty concentrating/ seeming " +
                            "spaced out. ");

                    textArea2.setText("One thing to keep in mind is that anxiety is very common among adolescents and" +
                            " children. 7.1% of children aged 3-17 years (approximately 4.4 million) have diagnosed " +
                            "anxiety. Its a very normal thing which is why education on it is so important! ");
                    GameDisplayForm.gameScore += 500;

                    break;
                case 2:
                    Title.setText("Feedback 2");
                    textArea1.setText("Being on edge and restless is an indication for multiple different mental " +
                            "health disorders. It is best to not assume that someone is okay based on only your experience" +
                            " with other individuals who have difficulty with certain projects at school. ");
                    textArea2.setText("");
                    GameDisplayForm.gameScore += 500;

                    break;
                case 3:
                    Title.setText("Feedback 3");
                    textArea1.setText("Excessive worry and family problems can increase mental health conditions. " +
                            "Generalized Anxiety Disorder develops slowly and often starts in the teen years. " +
                            "Both children and adults with GAD may experience physical symptoms that make it hard " +
                            "to function and that interfere with daily life. So, if this mental health condition were " +
                            "to continue without any recognition, then it would be more difficult to help as a mental " +
                            "health first aider.");

                    textArea2.setText("A website with more information: https://www.nimh.nih" +
                            ".gov/health/publications/generalized-anxiety-disorder-gad/index.shtml");
                    GameDisplayForm.gameScore += 500;

                    break;
            }
        }
        if (result == 0) {
            switch (scenario) {
                case 1:
                    Title.setText("Feedback 1");
                    textArea1.setText("Good choice! You were able to understand that something was wrong with your " +
                            "classmate and decided to talk to them despite not having a very close friendship. " +
                            "The first step as a mental health first aider is identifying a potential problem in an " +
                            "individual. Be sure that you are prepared to listen because oftentimes the best thing you " +
                            "can do is just be someone that the affected person can talk to. ");
                    textArea2.setText("One thing to keep in mind is that anxiety is very common among adolescents and" +
                            " children. 7.1% of children aged 3-17 years (approximately 4.4 million) have diagnosed " +
                            " anxiety. Its a very normal thing which is why education on it is so important!");
                    GameDisplayForm.gameScore += 1000;

                    break;
                case 2:
                    Title.setText("Feedback 2");
                    textArea1.setText("Good Job! You recognized that the individual was possibly being affected by anxiety. " +
                            "He showed signs of restlessness and being on edge, which can be major signs of anxiety. " +
                            "Whether he accepts your invitation to sit with him or not, he knows that you are concerned. " +
                            "This might open up more opportunities to share.");
                    textArea2.setText("");
                    GameDisplayForm.gameScore += 1000;

                    break;
                case 3:
                    Title.setText("Feedback 3");
                    textArea1.setText("Good job! You recognized that it was important to not attempt to fix the individual’s " +
                            "problems. You understood that letting the individual know that you are available to listen " +
                            "to their problems was the best that you could do under these circumstances. It is important " +
                            "to be sensitive to what an individual with anxiety is going through, even if it doesn’t make " +
                            "sense to you. Be open for when he reaches out to you again in the future.");

                    textArea2.setText("A website with more information: https://www.nimh.nih" +
                            ".gov/health/publications/generalized-anxiety-disorder-gad/index.shtml");

                    GameDisplayForm.gameScore += 1000;

                    break;
            }
        }
    }

}
