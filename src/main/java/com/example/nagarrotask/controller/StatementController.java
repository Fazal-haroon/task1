package com.example.nagarrotask.controller;


import com.example.nagarrotask.entities.Account;
import com.example.nagarrotask.entities.Statement;
import com.example.nagarrotask.mapper.AccountMapper;
import com.example.nagarrotask.mapper.StatementMapper;
import com.example.nagarrotask.service.AccountService;
import com.example.nagarrotask.service.Impl.IAccountService;
import com.example.nagarrotask.service.Impl.IStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/statement")
public class StatementController {

    @Autowired
    private IStatementService statementService;

    @GetMapping("/all")
    public List<Statement> getAll() {
        return statementService.findAll();
    }

//    @GetMapping("/date/{startDate}/{endDate}")
//    public List<Statement> getData_between(@PathVariable(value = "startDate") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate fromDate, @PathVariable(value = "endDate") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate toDate){
//        return statementService.getData_between(fromDate, toDate);
//    }

    @GetMapping("/date/{startDate}/{endDate}")
    public List<Statement> getData_between(@PathVariable(value = "startDate") String fromDate, @PathVariable(value = "endDate") String toDate){
        return statementService.getData_between(fromDate, toDate);
    }

    @GetMapping("/amount/{amount1}/{amount2}")
    public List<Statement> getAmount_between(@PathVariable(value = "amount1") String amount1 , @PathVariable(value = "amount2") String amount2){
        return statementService.getAmount_between(amount1, amount2);
    }
}
