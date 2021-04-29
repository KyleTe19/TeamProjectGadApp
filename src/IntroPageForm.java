import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroPageForm {
    public static JFrame myFrame = new JFrame ("This is a Generalized Anxiety Training Simulation");
    public JPanel welcomeForm;
    private JButton clickToStartButton;
    private JTextArea introPageBody;
    private JLabel image;
    public static int scenarioNumber = 1;
    public static int option;
    private ImageIcon introImage = new ImageIcon();

    public IntroPageForm() {
        image = new JLabel(String.valueOf(this.getClass().getResource("/images/Anxiety.png")));
        image.setIcon(introImage);
        clickToStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameDisplayForm.setRandomOptions();
                GameDisplayForm.setRandomModule();
                System.out.println(GameDisplayForm.getModuleNumber());
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
