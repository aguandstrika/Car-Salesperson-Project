/* For your final project, you will design a GUI program that can be used by a car dealer.
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

public class CarPackageCalculator extends JFrame {
	
	private JRadioButton modelS40, modelS60, modelS70, modelS80;
	private JCheckBox packageA, packageB, paint, financing, cash, tradeIn;
	private JLabel total;
	private JButton calculate, exit;
	private JPanel leftPanel, centerPanel, rightPanel;
	private ButtonGroup bg;
	
	public CarPackageCalculator() {
		
		modelS40 = new JRadioButton ("S40 Model - $27,700");
		modelS60 = new JRadioButton ("S60 Model - $32,500");
		modelS70 = new JRadioButton ("S70 Model - $36,000");
		modelS80 = new JRadioButton ("S80 Model - $44,000");
		packageA = new JCheckBox ("Package A - $2,200");
		packageB = new JCheckBox ("Package B - $3,250");
		paint = new JCheckBox ("Metalic Paint - $650");
		tradeIn = new JCheckBox ("Trade In");
		cash = new JCheckBox ("Cash - $750 discount");
		financing = new JCheckBox ("Financing - 7%");
		total = new JLabel ("Price: $0.00");
		calculate = new JButton ("Calculate");
		calculate.addActionListener(new calculateActionListener());
		exit = new JButton ("Exit");
		leftPanel = new JPanel();
		centerPanel = new JPanel();
		rightPanel = new JPanel();
		bg = new ButtonGroup();
		bg.add(modelS40);
		bg.add(modelS60);
		bg.add(modelS70);
		bg.add(modelS80);
		leftPanel.setLayout(new GridLayout(4,1));
		centerPanel.setLayout(new BorderLayout());
		centerPanel.setLayout(new GridLayout(6,1));
		rightPanel.setLayout(new GridLayout(3,1));
		leftPanel.add(modelS40);
		leftPanel.add(modelS60);
		leftPanel.add(modelS70);
		leftPanel.add(modelS80);
		centerPanel.add(packageA, BorderLayout.CENTER);
		centerPanel.add(packageB,BorderLayout.CENTER);
		centerPanel.add(paint,BorderLayout.CENTER);
		centerPanel.add(calculate, BorderLayout.WEST);
		centerPanel.add(exit, BorderLayout.EAST);
		centerPanel.add(total, BorderLayout.SOUTH);
		rightPanel.add(tradeIn);
		rightPanel.add(cash);
		rightPanel.add(financing);
		this.setLayout(new BorderLayout());
		add(leftPanel, BorderLayout.WEST);
		add(centerPanel, BorderLayout.CENTER);
		add(rightPanel, BorderLayout.EAST);
		
		this.setTitle("Automobile Quote");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 300);
		this.setVisible(true);
	
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
			if (paint.isSelected())
				totalCost += 650;
			if (cash.isSelected())
				totalCost -= 750;
			if (financing.isSelected())
				totalCost += totalCost*0.07;
			String quote = String.format("Price: $%.2f", totalCost+(totalCost*0.06)+titleTags);
			total.setText(quote);
			
		}		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CarPackageCalculator();

	}

}
