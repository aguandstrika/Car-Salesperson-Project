import javax.swing.*;
import javax.swing.colorchooser.ColorChooserComponentFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// the layout Structure of the program
public class Layout{

    //verbs
    JFrame frame;
    JPanel panel;
    JLayeredPane glassPanel;
    JPanel userInFoPanel;
    JButton button;
    JRadioButton radioButton;
    JTextField textField;
    JTextField firstNameInput;
    JTextField lastNameInput;
    JLabel userID;



    public void layout() {


        //user ID
        userID = new JLabel("ID");
        userID.setOpaque(true);
        userID.setSize(210,50);
        userID.setText("random id number");
        userID.setAlignmentX(Component.LEFT_ALIGNMENT);


        //first and last name
        firstNameInput = new JTextField("Fist Name: ", 10);
        lastNameInput = new JTextField("Last Name: ", 10);
        firstNameInput.setOpaque(true);
        lastNameInput.setOpaque(true);
        firstNameInput.setSize(200,50);
        lastNameInput.setSize(200,50);
        firstNameInput.setAlignmentX(Component.LEFT_ALIGNMENT);
        lastNameInput.setAlignmentX(Component.LEFT_ALIGNMENT);



        // first panel user info
        userInFoPanel = new JPanel();
        //userInFoPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        userInFoPanel.setAlignmentY(Component.TOP_ALIGNMENT);
        userInFoPanel.setMaximumSize(new Dimension(960, 60));
        userInFoPanel.setBackground(Color.PINK);
        userInFoPanel.add(firstNameInput);
        userInFoPanel.add(lastNameInput);
        userInFoPanel.add(userID);

        // master panel
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
        panel.add(Box.createRigidArea(new Dimension(2,4)));
        panel.add(userInFoPanel);


        //making the frame
        frame = new JFrame();
        frame.setTitle("Cars That Go");
        frame.setSize(960,840);
        frame.setResizable(true);
        frame.setBackground(Color.ORANGE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        //Setting frame to visible
        frame.setVisible(true);
        addCustomer();

    }

    public void addCustomer(){

        //making sample customer with random number generator
        Customer newCustomer = new Customer("bob", "bob street", 19992939);
        System.out.println(newCustomer);
    }



//    public static void addCustomer(){
//
//        //making sample customer with random number generator
//        Customer newCustomer = new Customer("bob", "bob street", 19992939);
//        newCustomer.customerAccountNumber();
//        System.out.println(newCustomer);
//    }

}