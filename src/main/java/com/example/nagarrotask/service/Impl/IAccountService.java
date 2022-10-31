package com.example.nagarrotask.service.Impl;

import com.example.nagarrotask.entities.Account;
import com.example.nagarrotask.mapper.AccountMapper;
import com.example.nagarrotask.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAccountService implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> getAllAccounts() {
        return accountMapper.getAllAccounts();
    }

    @Override
    public Account getAccount(int id) {
        return accountMapper.getAccount(id);
    }
}
