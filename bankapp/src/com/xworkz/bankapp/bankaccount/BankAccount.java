package com.xworkz.bankapp.bankaccount;

public class BankAccount
{
    public int accountId;
    public String[] branches;

    public void displayBankAccountDetails()
    {
        System.out.println("Account ID: " + accountId);
        System.out.print("Branches: ");
        for (String branch : branches) {
            System.out.print(branch + " ");
        }
    }
}
