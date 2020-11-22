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
    JPanel aderessPanel;
    JPanel panelTwo;
    JPanel panelThree;
    JPanel panelFour;
    JLayeredPane glassPanel;
    JPanel userInFoPanel;
    JButton button;
    JRadioButton radioButton;
    JTextField textField;
    JTextField firstNameInput;
    JTextField lastNameInput;
    JTextField phoneNumberInput;
    JTextField adderessInput;
    JLabel userID;



    public void layout() {

       /***********************Start of Panel one / user info****************************/
        //user ID
        userID = new JLabel("ID");
        userID.setOpaque(true);
        userID.setSize(210,50);
        userID.setText("random id number"); //I'm trying to figure out how to add the random number generator from customer.java

        //phone Number
        phoneNumberInput = new JTextField("Phone Number: ",10);
        phoneNumberInput.setOpaque(true);
        phoneNumberInput.setSize(200,50);


        //first and last name
        firstNameInput = new JTextField("Fist Name: ", 20);
        lastNameInput = new JTextField("Last Name: ", 20);
        firstNameInput.setOpaque(true);
        lastNameInput.setOpaque(true);
        firstNameInput.setSize(200,100);
        lastNameInput.setSize(200,100);

        firstNameInput.setHorizontalAlignment(SwingConstants.LEFT);


        adderessInput = new JTextField("Adderese:", 80);
        adderessInput.setOpaque(true);
        adderessInput.setSize(900,50);

        aderessPanel = new JPanel();
        aderessPanel.setMaximumSize(new Dimension(960, 60));
        aderessPanel.setBackground(Color.PINK);
        aderessPanel.add(adderessInput);

        // first panel user info
        userInFoPanel = new JPanel();
        userInFoPanel.setMaximumSize(new Dimension(960, 50));
        userInFoPanel.setBackground(Color.PINK);
        userInFoPanel.add(firstNameInput);
        userInFoPanel.add(lastNameInput);
        userInFoPanel.add(phoneNumberInput);
        userInFoPanel.add(userID);
        userInFoPanel.add(aderessPanel);


        /**********************End of Panel/ portion ome**********************/

        /****************************Start of panel two***********************************/

        panelTwo = new JPanel();
        panelTwo.setMaximumSize(new Dimension(960, 200));
        panelTwo.setBounds(64,0,960,200);
        panelTwo.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        panelTwo.setAlignmentY(Component.CENTER_ALIGNMENT);
        panelTwo.add(Box.createRigidArea(new Dimension(4,4)));
        panelTwo.setBackground(Color.CYAN);

        /****************************End of panel two****************************************************/




        /****************************Start of panel three***********************************/

        panelThree = new JPanel();
        panelThree.setMaximumSize(new Dimension(960, 300));
        panelThree.setBounds(64,0,960,200);
        panelThree.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        panelThree.setAlignmentY(Component.CENTER_ALIGNMENT);
        panelThree.add(Box.createRigidArea(new Dimension(4,4)));
        panelThree.setBackground(Color.orange);

        /****************************End of panel three****************************************************/

        /****************************Start of panel four***********************************/

        panelFour = new JPanel();
        panelFour.setMaximumSize(new Dimension(960, 300));
        panelFour.setBounds(64,0,960,200);
        panelFour.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        panelFour.setAlignmentY(Component.CENTER_ALIGNMENT);

        panelFour.add(Box.createRigidArea(new Dimension(4,4)));
        panelFour.setBackground(Color.magenta);

        /****************************End of panel four****************************************************/


//        // master panel
//        panel = new JPanel();
//        //panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
//        panel.setLayout(new GridLayout(6,1));
//        panel.add(Box.createRigidArea(new Dimension(4,4)));
//        panel.add(userInFoPanel);
//        panel.add(panelTwo);
//        panel.add(panelThree);
//        panel.add(panelFour);


        //making the frame
        frame = new JFrame();
        frame.setTitle("Cars That Go");
        frame.setSize(960,840);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.add(panel);
        frame.add(userInFoPanel);
        frame.add(panelTwo);
        frame.add(panelThree);
        frame.add(panelFour);
        frame.setLayout(new GridLayout(6,1));










        //Setting frame to visible
        frame.setVisible(true);
        addCustomer();

    }

    public void addCustomer(){

        //making sample customer with random number generator
        Customer newCustomer = new Customer("bob", "bob street", 19992939);
        System.out.println(newCustomer);
    }

}