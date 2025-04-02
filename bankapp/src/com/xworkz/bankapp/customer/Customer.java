package com.xworkz.bankapp.customer;
import com.xworkz.bankapp.bankaccount.BankAccount;

public class Customer {
    public int customerId;
    public String customerName;
    public BankAccount[] bankAccounts;

    public void displayCustomerDetails() {
        System.out.println("the customer ID is: " + customerId);
        System.out.println("the Customer Name is: " + customerName);
        System.out.println("the list Bank Accounts the coustomer have:");
        for (BankAccount account : bankAccounts) {
            account.displayBankAccountDetails();
        }

    }
}
