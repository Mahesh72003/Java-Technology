package com.xworkz.accountdetail;

import com.xworkz.accountdetail.dto.AccountDto;
import com.xworkz.accountdetail.service.AccountService;
import com.xworkz.accountdetail.service.impl.AccountServiceImpl;

public class AccountRunner {
    public static void main(String[] args) {
        System.out.println("main Started");

        AccountDto dto = new AccountDto();
        
        dto.setAccountName("Mahesh");
        dto.setAccountType("Savings");
        dto.setAddress("Bangalore");
        System.out.println(dto);

//        AccountService accountService = new AccountServiceImpl();
//        accountService.ValidAndSave(dto);

        AccountService accountService1 = new AccountServiceImpl();
        accountService1.UpdateData(4,"Current");

        System.out.println("main ended");
    }

}
