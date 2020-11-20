import com.sun.nio.sctp.PeerAddressChangeNotification;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class test implements AdjustmentListener, ActionListener {
    JButton buttonOne;

    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonFour;

    JPanel panelOne;
    JPanel paneltwo;
    public void layout(){

        buttonOne = new JButton();

        buttonTwo = new JButton();
        buttonThree = new JButton();
        buttonFour = new JButton();

        buttonOne.setText("press");

        buttonTwo.setText("Hell0");
        buttonThree.setText("Meow");
        buttonFour.setText("Woof");

        buttonOne.addActionListener(this);

        //making the frame/ outline
        JFrame frame = new JFrame();
        frame.setTitle("this is a test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960,840);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //making and panel to go inside the frame
        panelOne = new JPanel();
        paneltwo = new JPanel();

        //setting background color
        panelOne.setBackground(Color.PINK);
        paneltwo.setBackground(Color.CYAN);

        //dimension
        panelOne.setPreferredSize(new Dimension(800,100));
        paneltwo.setPreferredSize(new Dimension(800,100));

        //
       paneltwo.setVisible(false);


        //adding to frame
        frame.add(panelOne,BorderLayout.NORTH);
        frame.add(paneltwo,BorderLayout.SOUTH);

        panelOne.add(buttonOne);

        paneltwo.add(buttonTwo);
        paneltwo.add(buttonThree);
        paneltwo.add(buttonFour);


    }


    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buttonOne){
            //paneltwo.setEnabled(false);
            paneltwo.setBackground(Color.PINK);
            paneltwo.setVisible(true);
            System.out.println("press");
        }

    }

    public static void main(String[] args){

        test newTest = new test();
        newTest.layout();
    }

}
