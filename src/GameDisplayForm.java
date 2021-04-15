import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameDisplayForm {
    private JButton option2Button;
    private JButton option1Button;
    public JPanel mainDisplay;
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

    }


}
