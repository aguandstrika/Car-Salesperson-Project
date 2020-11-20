/*
 * Planing / mapping out the project
 *
 *main.java
 * main.class
 * layout.class
 *
 *Customer.java
 * v customerUserName
 * v customerAddress
 * v customerPhoneNumber
 * v customerAccountNumber random generator
 * customer.class ~constructor
 *
 *Car.java
 * car.class ~constructor
 *
 * -Package:
 * --A $2,200 available for all models
 * --B $3250 available only on 570 and 580
 *
 * -Color:
 * --Metallic paint option for $650.00
 * --red
 * --blue
 * --silver
 * --green
 * --black
 *
 *-models:
 *s40.java
 * $27,700 base
 *
 *s60.java
 * $32,500
 *
 *s70.java
 * $36,000
 *
 *s80.java
 * $44,000
 *
 *
 * Calculations.java
 * -trade-in:
 * --if 2000 or lower 1,000
 * --if 2001 or 2005 2,000
 * --if 2006-2010 4,000
 * --if 2012-2016 6,000
 * --if 2017-2020 10,000
 * taxes = 6%
 * cashBuyer = -750.00
 * financing at 7%
 *
 */
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
public class Main {

    public static void main(String[] args){
        //creating a new layout
        Layout newLayout = new Layout();
        newLayout.layout();
    }


}