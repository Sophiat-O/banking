package com.company;

public class AccountPosting {
    private Account accountDetails;
    //private long accountNumber;
    private float newBalance;


    public AccountPosting(Account _accountDetails){
        this.accountDetails = _accountDetails;
        //this.accountNumber = _accountNumber;
    }

    float depositMoney(float depositAmount){
        float currentBalance = this.accountDetails.getAccountBalance();
        newBalance = currentBalance + depositAmount;

        return newBalance ;
    }




}
