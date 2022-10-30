package com.example.nagarrotask.controller;

import com.example.nagarrotask.entities.Account;
import com.example.nagarrotask.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    // Injecting the AccountService class into the AccountController class.
    @Autowired
    private AccountService accountService;

    /**
     * It returns a list of all accounts.
     *
     * @return A list of all accounts
     */
    @GetMapping("/all")
    public ResponseEntity<List<Account>> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    /**
     * It returns the account with the given id.
     *
     * @param id The id of the account to be retrieved.
     * @return ResponseEntity<Account>
     */
    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable int id){
        return accountService.getAccount(id);
    }
}
