import java.util.Random;
public class Customer {
    String customerUserName;
    String customerAddress;
    int customerPhoneNumber;
    int customerAccountNumber; //random generator

    //making a new random
    Random rand = new Random();

    //
    Customer(String customerUserName, String customerAddress, int customerPhoneNumber, int customerAccountNumber){
        this.customerUserName = customerUserName;
        this.customerAddress = customerAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerAccountNumber = customerAccountNumber;
    }

    public int getCustomerAccountNumber() {
        return customerAccountNumber;
    } = rand.(1000);


}
