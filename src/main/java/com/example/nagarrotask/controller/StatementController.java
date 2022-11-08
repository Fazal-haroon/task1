package com.example.nagarrotask.controller;


import com.example.nagarrotask.entities.Statement;
import com.example.nagarrotask.service.Impl.IStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatementController {

    // Injecting the service class into the controller class.
    @Autowired
    private IStatementService statementService;

    /**
     * It returns a list of all the statements in the database
     *
     * @return A list of all statements
     */
    @GetMapping("/all")
    public List<Statement> getAll() {
        return statementService.findAll();
    }

    /**
     * It takes two strings as parameters, converts them to LocalDate objects, and then passes them to the
     * getData_between() function in the service layer
     *
     * @param fromDate The start date of the range.
     * @param toDate The end date of the range.
     * @return A list of statements
     */
    @GetMapping("/date/{startDate}/{endDate}")
    public List<Statement> getDateBetween(@PathVariable(value = "startDate") String fromDate, @PathVariable(value = "endDate") String toDate){
        return statementService.getDateBetween(fromDate, toDate);
    }

    /**
     * This function is used to get the statements between two amounts
     *
     * @param amount1 The lower bound of the amount range.
     * @param amount2 The upper bound of the amount range.
     * @return A list of statements
     */
    @GetMapping("/amount/{amount1}/{amount2}")
    public List<Statement> getAmountBetween(@PathVariable(value = "amount1") String amount1 , @PathVariable(value = "amount2") String amount2){
        return statementService.getAmountBetween(amount1, amount2);
    }
}
