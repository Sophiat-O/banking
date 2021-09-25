package com.company;
//import java.util.ArrayList;
import  java.util.Random;

public class Account {
    private Customer accountName;
    private Customer customerID;
    //ArrayList<Integer> accountNumber;
    private String accountStatus;
    private double accountBalance;

    public Account(Customer _customerID, Customer _accountName, String _accountStatus, double _accountBalance){
        this.accountName = _accountName;
        this.customerID = _customerID;
        this.accountStatus = _accountStatus;
        this.accountBalance = _accountBalance;

    }

    long getAccountNumber() {
        // generate account number using random() method
        Random rand = new Random();
        int number = 2;

        //Using StringBuilder to concatenate the numbers generated into 10-digit string

        StringBuilder generatedNumber = new StringBuilder(Integer.toString(number));

        int numDigits = generatedNumber.length();

        StringBuilder generatedAccountNumber = null;
        for (int i = 2; i <= 10; i++) {
            if (numDigits < 10) {
                int newNumber = rand.nextInt(10);
                generatedAccountNumber = generatedNumber.append(Integer.toString(newNumber));
                //generateAccountNumber.add(newNumber);

            }

        }

        // Converting the concatenating string into numbers
        long accountNumber = Long.parseLong(generatedAccountNumber.toString());


        return  accountNumber;

    }



    Customer getAccountName(){
        return accountName;
    }

    Customer getCusID(){
        return customerID;
    }

    String getAccountStatus(){
        return accountStatus;
    }

    double getAccountBalance(){
        return accountBalance;
    }


}
