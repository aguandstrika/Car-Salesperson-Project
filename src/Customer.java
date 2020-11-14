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

import java.util.Random;
public class Customer{
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
}
