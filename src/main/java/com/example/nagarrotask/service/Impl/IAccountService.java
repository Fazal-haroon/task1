package com.example.nagarrotask.service.Impl;

import com.example.nagarrotask.entities.Account;
import com.example.nagarrotask.exceptions.ResourceNotFoundException;
import com.example.nagarrotask.mapper.AccountMapper;
import com.example.nagarrotask.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return Optional.ofNullable(accountMapper.getAccount(id)).orElseThrow(()
                -> new ResourceNotFoundException(
                "NO ACCOUNT PRESENT WITH ID = " + id));
    }
}
