package com.xworkz.accountdetail.service.impl;

import com.xworkz.accountdetail.dto.AccountDto;
import com.xworkz.accountdetail.repo.AccountRepo;
import com.xworkz.accountdetail.repo.impl.AccountRepoImpl;
import com.xworkz.accountdetail.service.AccountService;

public class AccountServiceImpl implements AccountService {

    AccountRepo accountRepo;

    public AccountServiceImpl() {
        accountRepo = new AccountRepoImpl();
    }

    @Override
    public boolean ValidAndSave(AccountDto dto) {
        boolean accountValid = false;
        boolean accountNameValid = false;
        boolean accountTypeValid = false;
        boolean addressValid = false;

        if (dto.getAccountName() != null && !dto.getAccountName().isEmpty()) {
            accountNameValid = true;
        }
        if (dto.getAccountType() != null && !dto.getAccountType().isEmpty()) {
            accountTypeValid = true;
        }
        if (dto.getAddress() != null && !dto.getAddress().isEmpty()) {
            addressValid = true;
        }
        if (accountNameValid && accountTypeValid && addressValid) {
            accountValid = accountRepo.SaveAccountDetail(dto);
        }

        return accountValid;
    }

    @Override
    public boolean UpdateData(int id, String accountType) {
        boolean updateAccount=false;
        if(id>0 && !accountType.isEmpty() && accountType!=null)
        {
            System.out.println("pass the service");
            updateAccount=accountRepo.UpdateAccountDetail(id,accountType);
        }
        else
        {
            System.out.println("did not pass the service");
        }
        return updateAccount;
    }
}
