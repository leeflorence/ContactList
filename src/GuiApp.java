
import java.awt.*; // needed for FlowLayout
import java.awt.event.*; // needed for ActionListener
import javax.swing.*; // needed for JFrame, JLabel and JButton

/**
 *
 */
public class GuiApp extends JFrame implements ActionListener {
    private JButton addContact; // UseCase1
    private JButton print; // UseCase2
    private JButton byLastName; // UseCase3
    private JButton quit; // UseCase4
    // UseCase5
    private JLabel prompt;
    private JTextField userInput;

    /**
     * Constructor sets properties of the JFrame, adds the buttons to it.
     */
    public GuiApp() {
        this.setLayout(new FlowLayout());
        this.setSize(250, 400);

        /*
         * Tells the system to call the actionPerformed() method when the user
         * presses the JButton. (Note: must call addActionListener() with each
         * JComponent)
         */
        prompt = new JLabel("CHOOSE ONE OF THE FOLLOWING:");
        this.add(prompt);
        addContact = new JButton("CREATE CONTACT");
        this.add(addContact);
        print = new JButton("PRINT CONTACT LIST");
        this.add(print);
        byLastName = new JButton("CHECK BY LAST NAME");
        this.add(byLastName);
        quit = new JButton("QUIT");
        this.add(quit);
        this.setVisible(true);

    }

    /**
     * When the user presses the JButton to select one of the Use Cases, Java
     * will automatically call this method when the user event happens. The
     * methods that are stored in the ContactList will be called depending on
     * which Use Case being selected.
     */
    public void actionPerformed(ActionEvent userEvent) {
    }
    // use switch statement?
}
