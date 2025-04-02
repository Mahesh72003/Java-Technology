package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.customer.Customer;

public class BankRunner {
    public static void main(String[] args)
    {
        String branchesforBabu[]={"rajajinagar","basavanagudi"};

        BankAccount[] bankAccounts = new BankAccount[2];
        BankAccount account1 = new BankAccount();
        account1.accountId = 101;
        account1.branches =branchesforBabu;
        bankAccounts[0] = account1;

        Customer customer1 = new Customer();
        customer1.customerId = 1;
        customer1.customerName = "Babu";
        customer1.bankAccounts = bankAccounts;
        customer1.displayCustomerDetails();
    }
}
