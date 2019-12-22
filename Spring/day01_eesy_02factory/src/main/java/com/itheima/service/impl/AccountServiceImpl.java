package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    @Override
    public void saveAccount() {
//        IAccountDao accountDao = new AccountDaoImpl();
        IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");
        accountDao.saveAccount();
    }
}
