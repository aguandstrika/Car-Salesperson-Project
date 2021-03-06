FinalProject/src/CarPackageCalculator.java                                                          0000644 0       0       23343       13764521145 16714   0                                                                                                    ustar 00nobody                          nobody                                                                                                                                                                                                                 /* For your final project, you will design a GUI program that can be used by a car dealer. 
  You are free to use any controls/code, even if it was not taught in class. Use whatever you want to make a great project.  
Include the following in your window: 
- A randomly generated account number.

Prompts for the following customer info:
- Name
- Address
- Phone number
 
You will calculate the final cost of the car based on the following criteria. You have four (4) models for sale:
- S40 --> $27700
- S60 --> $32500
- S70 --> $36000
- S80 --> $44000 

The following two option packages are available:
- Package “A” ($2200): Available on all models. 
- Package “B” ($3250): Available only on S70 and S80. 

- Metallic paint is also an option for $650.00.

- Sales tax is 6%
- Title and tags is $325.00. 


- Trade-ins should be allowed if desired by the customer.  The trade-in price should be deducted from the sales price. 
- The customer should be able to choose financing (at 7%). 
- If the customer pays cash give him/her a discount of $750.00.

Display the final cost of the vehicle as well as any information you would like to see if you were the customer.

* Include exception handling when possible.
* Include an Exit Button on the window.*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class CarPackageCalculator extends JFrame {
	
	private JRadioButton modelS40, modelS60, modelS70, modelS80;
	private JCheckBox packageA, packageB, paintM, paintR, financing, cash, tradeIn;
	private JLabel total, modelL, packageL, paintL, tradeInL, financingL, tdPrice;
	private JTextField td;
	private JButton calculate, exit;
	private JPanel infoPanel2, modelPanel2, packagePanel2, paintPanel2, tradeInsPanel2, financingPanel2;
	private ButtonGroup bg;
	private ImageIcon icon1;
	private Border border;
	
	public CarPackageCalculator() {
		
		icon1 = new ImageIcon ("logo.png");
		border = BorderFactory.createLineBorder(new Color(0x8aa4ab), 3);
		
		modelS40 = new JRadioButton ("S40 Model - $27,700");
		modelS60 = new JRadioButton ("S60 Model - $32,500");
		modelS70 = new JRadioButton ("S70 Model - $36,000");
		modelS80 = new JRadioButton ("S80 Model - $44,000");
		
		bg = new ButtonGroup();
		bg.add(modelS40);
		bg.add(modelS60);
		bg.add(modelS70);
		bg.add(modelS80);
		
		packageA = new JCheckBox ("Package A - $2,200");
		packageB = new JCheckBox ("Package B - $3,250");
		paintR = new JCheckBox ("Regular");
		paintM = new JCheckBox ("Metalic - $650");
		cash = new JCheckBox ("Cash - $750 discount");
		financing = new JCheckBox ("Financing - 7%");
		tradeIn = new JCheckBox ("Do you want to use trade-in? ");
		
		tdPrice = new JLabel ("Trade-In Price: ");
		total = new JLabel ("Price: $0.00");
		
		td = new JTextField(10);
		
		modelL = new JLabel ();
		modelL.setText("Model");
		modelL.setHorizontalTextPosition(JLabel.CENTER);
		modelL.setVerticalTextPosition(JLabel.TOP);
		modelL.setForeground(new Color(0x416270)); //set font color of text 416270 e3ded9
		modelL.setFont(new Font("MV Boli",Font.BOLD,18)); //set font of text
		modelL.setBackground(new Color(0xe3ded9)); //set background color bba686
		modelL.setOpaque(true); //display background color
		modelL.setBorder(border); //sets border of label (not image+text)
		modelL.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		modelL.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
	
		
		packageL = new JLabel ();
		packageL.setText("Package");
		packageL.setHorizontalTextPosition(JLabel.CENTER);
		packageL.setVerticalTextPosition(JLabel.TOP);
		packageL.setForeground(new Color(0x416270)); //set font color of text 416270 e3ded9
		packageL.setFont(new Font("MV Boli",Font.BOLD,18)); //set font of text
		packageL.setBackground(new Color(0xe3ded9)); //set background color bba686
		packageL.setOpaque(true); //display background color
		packageL.setBorder(border); //sets border of label (not image+text)
		packageL.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		packageL.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		
		paintL = new JLabel();
		paintL.setText ("Paint");
		paintL.setHorizontalTextPosition(JLabel.CENTER);
		paintL.setVerticalTextPosition(JLabel.TOP);
		paintL.setForeground(new Color(0x416270)); //set font color of text 416270 e3ded9
		paintL.setFont(new Font("MV Boli",Font.BOLD,18)); //set font of text
		paintL.setBackground(new Color(0xe3ded9)); //set background color bba686
		paintL.setOpaque(true); //display background color
		paintL.setBorder(border); //sets border of label (not image+text)
		paintL.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		paintL.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		
		tradeInL = new JLabel("Trade-In");
		tradeInL.setText("Trade-Ins");
		tradeInL.setHorizontalTextPosition(JLabel.CENTER);
		tradeInL.setVerticalTextPosition(JLabel.TOP);
		tradeInL.setForeground(new Color(0x416270)); //set font color of text 416270 e3ded9
		tradeInL.setFont(new Font("MV Boli",Font.BOLD,18)); //set font of text
		tradeInL.setBackground(new Color(0xe3ded9)); //set background color bba686
		tradeInL.setOpaque(true); //display background color
		tradeInL.setBorder(border); //sets border of label (not image+text)
		tradeInL.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		tradeInL.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		
		financingL = new JLabel ();
		financingL.setText("Financing");
		financingL.setHorizontalTextPosition(JLabel.CENTER);
		financingL.setVerticalTextPosition(JLabel.TOP);
		financingL.setForeground(new Color(0x416270)); //set font color of text 416270 e3ded9
		financingL.setFont(new Font("MV Boli",Font.BOLD,18)); //set font of text
		financingL.setBackground(new Color(0xe3ded9)); //set background color bba686
		financingL.setOpaque(true); //display background color
		financingL.setBorder(border); //sets border of label (not image+text)
		financingL.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		financingL.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		
		
		calculate = new JButton ("Calculate");
		calculate.addActionListener(new calculateActionListener());
		exit = new JButton ("Exit");
		
		modelPanel2 = new JPanel();
		packagePanel2 = new JPanel();
		paintPanel2 = new JPanel();
		tradeInsPanel2 = new JPanel();
		financingPanel2 = new JPanel();
	
		
	
		
		
		//--------------- Panels -------------------//
		
	
		modelPanel2.setLayout(new BorderLayout());
		modelPanel2.setLayout(new GridLayout(5,1));
		packagePanel2.setLayout(new BorderLayout());
		packagePanel2.setLayout(new GridLayout(4,1));
		paintPanel2.setLayout(new BorderLayout());
		paintPanel2.setLayout(new GridLayout(3,1));
		tradeInsPanel2.setLayout(new BorderLayout());
		tradeInsPanel2.setLayout(new GridLayout(4,1));
		financingPanel2.setLayout(new BorderLayout());
		financingPanel2.setLayout(new GridLayout(7,1));
		
		modelPanel2.add(modelL);
		modelPanel2.add(modelS40);
		modelPanel2.add(modelS60);
		modelPanel2.add(modelS70);
		modelPanel2.add(modelS80);
		
		
		packagePanel2.add(packageL);
		packagePanel2.add(packageA, BorderLayout.NORTH);
		packagePanel2.add(packageB,BorderLayout.SOUTH);
		
		paintPanel2.add(paintL);
		paintPanel2.add(paintR, BorderLayout.NORTH);
		paintPanel2.add(paintM, BorderLayout.SOUTH);
		
		tradeInsPanel2.add(tradeInL);
		tradeInsPanel2.add(tradeIn, BorderLayout.NORTH);
		tradeInsPanel2.add(tdPrice, BorderLayout.WEST);
		tradeInsPanel2.add(td, BorderLayout.CENTER);
		
		
		financingPanel2.add(financingL);
		financingPanel2.add(cash, BorderLayout.NORTH);
		financingPanel2.add(financing, BorderLayout.NORTH);
		financingPanel2.add(calculate, BorderLayout.SOUTH);
		financingPanel2.add(exit, BorderLayout.SOUTH);
		financingPanel2.add(total, BorderLayout.SOUTH);
		
		this.setLayout (new GridLayout(5,1));
		this.add(modelPanel2);
		this.add(packagePanel2);
		this.add(paintPanel2);
		this.add(tradeInsPanel2);
		this.add(financingPanel2);
		
		//----------------------------------------------//
		
		
		
		this.getContentPane().setBackground(new Color(0x8aa4ab));
		this.setIconImage(icon1.getImage());
		this.setTitle("Automobile Quote");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 900);
		this.setVisible(true);
	
	}
	
	private JTextField JTextField(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private class calculateActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double totalCost = 0.0;
			double titleTags = 325.0;
			if (modelS40.isSelected())
				totalCost += 27700;
			if (modelS60.isSelected())
				totalCost += 32500;
			if (modelS70.isSelected())
				totalCost += 36000;
			if (modelS80.isSelected())
				totalCost += 44000;
			if (packageA.isSelected())
				totalCost += 2200;
			if (packageB.isSelected())
				totalCost += 3250;
			if (paintM.isSelected())
				totalCost += 650;
			if (tradeIn.isSelected()) {
				try {
					double tradeInPrice = Double.parseDouble(td.getText());
					totalCost -= tradeInPrice;
				}
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,"Wrong trade-In price input");
	
				}
			}
				
			if (cash.isSelected())
				totalCost -= 750;
			if (financing.isSelected())
				totalCost += totalCost*0.07;
			String quote = String.format("Price: $%.2f", totalCost+titleTags+(totalCost*0.06));
			total.setText(quote);
			
		}		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CarPackageCalculator();

	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             