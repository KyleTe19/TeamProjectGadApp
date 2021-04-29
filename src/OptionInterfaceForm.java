import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionInterfaceForm {
    public JPanel optionFeedback;
    private JButton clickToContinueButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    public static JFrame optionFrame;

    public OptionInterfaceForm() {
        optionInterface(IntroPageForm.scenarioNumber, IntroPageForm.option);
        IntroPageForm.scenarioNumber++;
        System.out.println(IntroPageForm.scenarioNumber);


        clickToContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /*
               optionFrame = new JFrame("");
                optionFrame.setContentPane(new GameDisplayForm().mainDisplay);
                optionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                optionFrame.setPreferredSize(new Dimension(1000, 600));
                optionFrame.pack();
                optionFrame.setVisible(true);
                GameDisplayForm.GameDisplayFrame.dispose();
                */

                IntroPageForm.myFrame.setContentPane(new GameDisplayForm().mainDisplay);
                resultsFrame(IntroPageForm.scenarioNumber);


            }
        });
    }
    public void optionInterface(int scenario, int option) {
        if (option == 1)
        {
            switch (scenario){
                case 1:
                    textArea1.setText("It is important to recognize mental health conditions even in individuals whom" +
                            " you are not very close with. If unrecognized, mental health conditions can become harder to gain control of. " +
                            "One of the symptoms of many mental health conditions is lack of sleep which induces tiredness. " +
                            "This then will lead to having difficulty concentrating/ spacing out. ");
                    textArea2.setText("One thing to keep in mind is that anxiety is very common among adolescents and" +
                            " children. 7.1% of children aged 3-17 years (approximately 4.4 million) have diagnosed " +
                            "anxiety. Its a very normal thing which is why education on it is so important! ");
                    break;
                case 2:
                    textArea1.setText("Being on edge and restless is an indication of multiple different mental " +
                            "health disorders. It is best not to assume that someone is okay based on preconceptions." +
                            " Plus it is always better to be safe than!" );

                    textArea2.setText("");
                    break;
                case 3:
                    textArea1.setText("Excessive worry and family problems can be a catalyst for  mental health " +
                            "conditions. Generalized Anxiety Disorder develops slowly and often starts in the teen years. " +
                            "Both children and adults with GAD may experience physical symptoms that make it hard to function" +
                            " causing heavy interference with daily life. So, if this mental health condition were to" +
                            " continue without any recognition, it would become increasingly difficult to help as a " +
                            "mental health first aider.");

                    textArea2.setText("");
                    break;
            }
        }
        if (option == 2) {
            switch (scenario) {
                case 1:
                    textArea1.setText("Good choice! You were able to understand that your classmate could be dealing " +
                            " with more than just a bad day" +
                            " and decided to talk to them despite not having a very close friendship. The first step" +
                            " as a mental health first aider is being able to recognize signs of a condition in " +
                            "others. Be sure that you are prepared to listen because oftentimes the best thing you can " +
                            "do is just be someone that the affected person can talk to.");

                    textArea2.setText("One thing to keep in mind is that anxiety is very common among adolescents and" +
                            " children. 7.1% of children aged 3-17 years (approximately 4.4 million) have diagnosed " +
                            " anxiety. Its a very normal thing which is why education on it is so important!");

                    break;

                case 2:
                    textArea1.setText("Good Job! You recognized that the individual was possibly being affected by anxiety. " +
                            "He showed signs of restlessness and being on edge, which can be major signs of anxiety. " +
                            "Whether he accepts your invitation to sit with him or not does not really matter, he " +
                            "knows that you are " +
                            "concerned and this might open up more opportunities to help them later.");

                    textArea2.setText("");

                    break;

                case 3:
                    textArea1.setText("Good job! You recognized that it was important to not attempt to fix the individual’s problems. " +
                            "You understood that letting the individual know that you are available to listen to their problems " +
                            "was the best that you could do under these circumstances. It is important to be sensitive to " +
                            "what an individual with anxiety is going through, even if it does not make sense to you." +
                            "Be open for when they reach out to you again.");
                    textArea2.setText("");
                    break;
            }
        }
    }
    public void endingMessage(int scenarioNumber){
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
    public void resultsFrame(int scenarioNumber){
        if (scenarioNumber == 4) {
            IntroPageForm.myFrame.setContentPane(new ResultsFrame().Results);
        }
        // Want to add score here and also a button that lets them play again or exit.

    }
}
