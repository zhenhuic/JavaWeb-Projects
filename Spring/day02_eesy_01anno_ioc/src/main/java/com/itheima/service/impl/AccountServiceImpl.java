package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;
import org.springframework.stereotype.Component;

/**
 * 账户的业务层实现类
 */
@Component(value = "accountService")
public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("保存账户");
        IAccountDao accountDao = new AccountDaoImpl();
        accountDao.saveAccount();
    }
}
