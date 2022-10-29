package com.example.nagarrotask.controller;

import com.example.nagarrotask.entities.Account;
import com.example.nagarrotask.mapper.AccountMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private AccountMapper accountMapper;

    public AccountController(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Account>> getAllAccounts(){
        return ResponseEntity.ok(accountMapper.getAllAccounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable int id){
        return ResponseEntity.ok(accountMapper.getAccount(id));
    }
}
