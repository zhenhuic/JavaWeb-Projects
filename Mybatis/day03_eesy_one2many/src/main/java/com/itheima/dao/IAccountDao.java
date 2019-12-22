package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;

import java.util.List;

public interface IAccountDao {
    /**
     * 查询所有用户，同时还要获取到当前账户的所属用户信息
     */
    List<Account> findAll();

    /**
     * 查询所有账户，并且带有用户名和地址信息
     */
    List<AccountUser> findAllAccount();
}
