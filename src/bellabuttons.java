import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class bellabuttons implements ActionListener {

    JButton button;
    JTextField field;


    public void layout() {
        button = new JButton();
        button.setText("press");
        button.setBounds(100, 100, 100, 50);
        //  button.setFocusable(true);
        button.addActionListener(this);
        // button.setVisible(true);

        field = new JTextField(10);
        field.setBounds(200, 400, 200, 100);
        field.setMaximumSize(new Dimension(80, 10));
        field.setBackground(Color.PINK);
        field.addActionListener(this);
        field.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setSize(1000, 1500);
        frame.setTitle("Bellas buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //adds
        // field.add(field);
        frame.add(button, BorderLayout.SOUTH);
        frame.add(field, BorderLayout.SOUTH);

        frame.setVisible(true);

    }


    public static void main(String[] args) {
        bellabuttons newBellaButtons = new bellabuttons();
        newBellaButtons.layout();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       String text = field.getText();

        if (e.getSource() == button) {
            System.out.println(text);
            //make file
            try {
                FileWriter file = new FileWriter("file.txt");
                file.write(text);
                file.close();
            } catch (Exception e1) {
                System.out.println("error " + e1.getMessage());
            }
        }
    }
}