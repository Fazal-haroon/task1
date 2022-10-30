package com.example.nagarrotask.service;

import com.example.nagarrotask.entities.Account;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AccountService {

    /**
     * Get all accounts.
     *
     * @return A list of all accounts
     */
    ResponseEntity<List<Account>> getAllAccounts();

    /**
     * Get the account with the given id.
     *
     * @param id The id of the account to retrieve.
     * @return An Account object
     */
    ResponseEntity<Account> getAccount(int id);
}
