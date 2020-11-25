package com.kou.service;

import com.kou.domain.Account;

import java.util.List;

/**
 * 业务层接口
 * @author dell
 */
public interface IAccountService {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}
