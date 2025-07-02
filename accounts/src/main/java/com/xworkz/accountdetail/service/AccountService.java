package com.xworkz.accountdetail.service;

import com.xworkz.accountdetail.dto.AccountDto;

public interface AccountService {
    boolean ValidAndSave(AccountDto dto);

    boolean UpdateData(int id, String accountType);
}
