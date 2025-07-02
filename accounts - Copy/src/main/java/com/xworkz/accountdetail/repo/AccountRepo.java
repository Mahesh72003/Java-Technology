package com.xworkz.accountdetail.repo;

import com.xworkz.accountdetail.dto.AccountDto;

public interface AccountRepo {
    boolean SaveAccountDetail(AccountDto dto);

}
