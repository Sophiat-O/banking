package com.company;
//import java.util.Scanner;
//import java.util.Random;

public class Customer {

    private int customerID;
    private String name;
    private String address;

//    Random rand = new Random();
//    int maxCusID = 100;
//    int customerID =  rand.nextInt(maxCusID);
//
//    System.out.println("Enter your full name: ");

//    Scanner sc = new Scanner(System.in);
//
//    String name = sc.nextLine();
//
//    String address = sc.nextLine();
    //int maxCustID;

    public Customer(int _customerID, String _name, String _address) {

        this.customerID = _customerID;
        this.name = _name;
        this.address = _address;
    }

    String getName(){
        return name;

        }

    String getAddress(){
        return address;

    }


    int getCustomerID(){
        return customerID;

    }




}
