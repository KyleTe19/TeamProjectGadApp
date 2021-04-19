import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionInterfaceForm {
    public JPanel optionFeedback;
    private JButton clickToContinueButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    public static JFrame myFrame;

    public OptionInterfaceForm() {
        optionInterface(IntroPageForm.scenarioNumber, IntroPageForm.option);
        IntroPageForm.scenarioNumber++;
        clickToContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame = new JFrame("");
                myFrame.setContentPane(new GameDisplayForm().mainDisplay);
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setPreferredSize(new Dimension(1000, 600));
                myFrame.pack();
                myFrame.setVisible(true);



            }
        });
    }
    public void optionInterface(int scenario, int option) {
        if (option == 1)
        {
            switch (scenario){
                case 1:
                    textArea1.setText("It is important to recognize mental health issues even in individuals who you are not very close with. If unrecognized by anyone, mental health conditions can become harder to gain control of. One of the symptoms of many mental health conditions is lack of sleep which induces tiredness. This then will lead to having difficulty concentrating/ seeming spaced out. ");
                    textArea2.setText("https://www.nimh.nih.gov/health/publications/generalized-anxiety-disorder-gad/index.shtml");
                    break;
                case 2:
                    textArea1.setText("Being on edge and restless is an indication for multiple different mental health disorders. It is best to not assume that someone is okay based on only your experience with other individuals who have difficulty with certain projects at school. ");
                    textArea2.setText("https://www.nimh.nih.gov/health/publications/generalized-anxiety-disorder-gad/index.shtml");
                    break;
                case 3:
                    textArea1.setText("Excessive worry and family problems can increase mental health conditions. Generalized Anxiety Disorder develops slowly and often starts in the teen years. Both children and adults with GAD may experience physical symptoms that make it hard to function and that interfere with daily life. So, if this mental health condition were to continue without any recognition, then it would be more difficult to help as a mental health first aider.");
                    textArea2.setText("https://www.nimh.nih.gov/health/publications/generalized-anxiety-disorder-gad/index.shtml");
                    break;
            }
        }
        if (option == 2) {
            switch (scenario) {
                case 1:
                    textArea1.setText("Good choice! You were able to understand that something was wrong with your classmate and decided to talk to them despite not having a very close friendship. The first step as a mental health first aider is identifying a potential problem in an individual. Be sure that you are prepared to listen because oftentimes the best thing you can do is just be someone that the affected person can talk to. ");
                    textArea2.setText("");
                    break;
                case 2:
                    textArea1.setText("Good Job! You recognized that the individual was possibly being affected by anxiety. He showed signs of restlessness and being on edge, which can be major signs of anxiety. Whether he accepts your invitation to sit with him or not, he knows that you are concerned. This might open up more opportunities to share.");
                    textArea2.setText("");
                    break;
                case 3:
                    textArea1.setText("Good job! You recognized that it was important to not attempt to fix the individual’s problems. You understood that letting the individual know that you are available to listen to their problems was the best that you could do under these circumstances. It is important to be sensitive to what an individual with anxiety is going through, even if it doesn’t make sense to you. Be open for when he reaches out to you again in the future.");
                    textArea2.setText("");
                    break;
            }
        }
    }
}
