import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.Random;

    public class CarPackageCalculator extends JFrame {

        private JRadioButton modelS40, modelS60, modelS70, modelS80;
        private JCheckBox packageA, packageB, paintM, paintR, financing, cash, tradeIn;
        private JLabel total, modelL, packageL, paintL, tradeInL, financingL, tdPrice, customerL, firstNameL,lastNameL,addressL, phoneL;
        private JTextField td, firstName, lastName, address, phone;
        private JButton calculate, exit;
        private JPanel infoPanel2, modelPanel2, packagePanel2, paintPanel2, tradeInsPanel2, financingPanel2, customerPanel2;
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

            firstNameL= new JLabel("First name: ");
            firstNameL.setVisible(true);

            lastNameL = new JLabel("Last name");
            lastNameL.setVisible(true);

            phoneL = new JLabel("Phone number");
            phoneL.setVisible(true);

            addressL = new JLabel("Address");
            addressL.setVisible(true);


            firstName = new JTextField(20);
            firstName.setOpaque(true);
            firstName.setVisible(true);

            lastName = new JTextField(20);
            lastName.setOpaque(true);
            lastName.setVisible(true);

            phone = new JTextField();
            phone.setVisible(true);
            phone.setOpaque(true);

            address = new JTextField(50);
            address.setOpaque(true);
            address.setVisible(true);

            customerL = new JLabel();
            customerL.setText("Customer");
            customerL.setHorizontalTextPosition(JLabel.CENTER);
            customerL.setVerticalTextPosition(JLabel.TOP);
            customerL.setForeground(new Color(0x416270)); //set font color of text 416270 e3ded9
            customerL.setFont(new Font("MV Boli",Font.BOLD,18)); //set font of text
            customerL.setBackground(new Color(0xe3ded9)); //set background color bba686
            customerL.setOpaque(true); //display background color
            customerL.setBorder(border); //sets border of label (not image+text)
            customerL.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
            customerL.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
            customerL.setVisible(true);


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

            customerPanel2 = new JPanel();
            modelPanel2 = new JPanel();
            packagePanel2 = new JPanel();
            paintPanel2 = new JPanel();
            tradeInsPanel2 = new JPanel();
            financingPanel2 = new JPanel();





            //--------------- Panels -------------------//

            customerPanel2.setLayout(new BorderLayout());
            customerPanel2.setLayout(new GridLayout(4,1));
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

            customerPanel2.add(firstNameL,BorderLayout.NORTH);
            customerPanel2.add(firstName,BorderLayout.NORTH);
            customerPanel2.add(lastNameL,BorderLayout.NORTH);
            customerPanel2.add(lastName,BorderLayout.NORTH);
            customerPanel2.add(phoneL,BorderLayout.NORTH);
            customerPanel2.add(phone,BorderLayout.NORTH);
            customerPanel2.add(addressL,BorderLayout.NORTH);
            customerPanel2.add(address,BorderLayout.NORTH);


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

            this.setLayout (new GridLayout(6,1));
            this.add(customerPanel2);
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
            this.setSize(500, 1000);
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


                if (e.getSource()==calculate){
                    String firstName = fristName.getText();
                    String lastName = lastName.getText();
                    System.out.println("First name: "+firstName+" "+"Last name: "+lastName);
                    String address = address.getText();
                    System.out.println("Home address:"+address);
                    String phoneNumber = phone.getText();
                    System.out.println("Phone number"+phoneNumber);


            }

        }



        /*
         *
         * Customer.java
         * v customerUserName
         * v customerAddress
         * v customerPhoneNumber
         * v customerAccountNumber random generator
         * customer.class ~constructor
         *
         *
         *
         * */


        public static class Customer{
            //verables
            String customerUserName;
            String customerAddress;
            int customerPhoneNumber;
            int customerAccountNumber; //random generator


            //constructor
            Customer(String customerUserName, String customerAddress, int customerPhoneNumber){
                this.customerUserName = customerUserName;
                this.customerAddress = customerAddress;
                this.customerPhoneNumber = customerPhoneNumber;
                this.customerAccountNumber = accountNumberGenerator();
            }
            //Getters and setters

            public int accountNumberGenerator(){
                Random rand = new Random();
                return rand.nextInt(1000);
            }

            public String getCustomerUserName() {
                return customerUserName;
            }

            public void setCustomerUserName(String customerUserName) {
                this.customerUserName = customerUserName;
            }

            public String getCustomerAddress() {
                return customerAddress;
            }

            public void setCustomerAddress(String customerAddress) {
                this.customerAddress = customerAddress;
            }

            public int getCustomerPhoneNumber() {
                return customerPhoneNumber;
            }

            public void setCustomerPhoneNumber(int customerPhoneNumber) {
                this.customerPhoneNumber = customerPhoneNumber;
            }

            public int getCustomerAccountNumber() {
                return customerAccountNumber;
            }

            public void setCustomerAccountNumber(int customerAccountNumber) {
                this.customerAccountNumber = customerAccountNumber;
            }


            @Override
            public String toString() {
                return "Customer{" +
                        "customer Name: '" + customerUserName + '\n' +
                        ", Address: " + customerAddress + '\n' +
                        ", Phone Number: " + customerPhoneNumber + '\n' +
                        ", Account Number: " + customerAccountNumber + "-" + customerUserName;
            }

            public void customerAccountNumber() {
                System.out.println(customerAccountNumber +"-"+ customerUserName);
            }
        }


        public void addCustomer(){

            //making sample customer with random number generator
            Customer newCustomer = new Customer("bob", "bob street", 19992939);
            System.out.println(newCustomer);
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            new CarPackageCalculator();
            Customer newCustomer1 = new Customer("bob", "bob street", 19992939);
        }

    }

