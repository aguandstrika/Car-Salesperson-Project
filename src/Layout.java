import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

// the layout / Structure of the program
public class Layout {

    public static void layout(){
        addCustomer();

        JFrame frame = new JFrame(); //build a frame

        frame.setTitle("Cars That Go"); // Title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close program
        frame.setResizable(true);// allow resize
        frame.setSize(1500, 1000); // Setting dimensions
        frame.setVisible(true); // Making frame visible

        ImageIcon image = new ImageIcon("car.png"); // Icon image
        frame.setIconImage(image.getImage());// adding icon image to the frame
        frame.getContentPane().setBackground(Color.lightGray);
    }





















public static void addCustomer(){

    //making sample customer with random number generator
    Customer newCustomer = new Customer("bob", "bob street", 19992939);
    System.out.println(newCustomer);

}

}
