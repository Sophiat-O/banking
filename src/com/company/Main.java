package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // this will generate a random number which will be used as the customer ID
        Random rand = new Random();
        int maxCusID = 100000;
        int customerID =  rand.nextInt(maxCusID);

        Scanner sc = new Scanner(System.in);

        // ask customer to input their name and address

        System.out.println("Enter your full name: ");

        String name = sc.nextLine();

        System.out.println("Enter your address: ");

        String address = sc.nextLine();

        // initialize the new customer

        Customer cus1 = new Customer(customerID, name, address);

        Account cusAcc1 = new Account(cus1,cus1, "Open",0);

        System.out.println("This is your customer details: " + name + " , Address: " + address);
        System.out.println("This is your AccountNumber: "+ cusAcc1.getAccountNumber());
        System.out.println("This is your AccountName: "+ cusAcc1.getAccountName());

        // generate random 10-digit number for the Account Number
    }
}
