package com.company;
import  java.util.Random;

public class Account {
    private Customer customer;
    private String accountStatus;
    private float accountBalance;

    public Account(Customer _customer, String _accountStatus, float _accountBalance){
        this.customer = _customer;
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

        // Converting the concatenated string into numbers
        long accountNumber = Long.parseLong(generatedAccountNumber.toString());

        return  accountNumber;

    }

    String getAccountName(){
        //this.customer.getName();
        return this.customer.getName();
    }

    int getCusID(){
        //this.customer.getName();
        return this.customer.getCustomerID();
    }


    String getAccountStatus(){
        return accountStatus;
    }

    float getAccountBalance(){
        return accountBalance;
    }


}
