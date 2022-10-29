package com.example.nagarrotask.service;

import com.example.nagarrotask.entities.Statement;

import java.time.LocalDate;
import java.util.List;

public interface StatementService {
    List<Statement> findAll();

    List<Statement> getAmount_between(String amount1, String amount2);

    List<Statement> getData_between(String fromDate, String toDate);
}
