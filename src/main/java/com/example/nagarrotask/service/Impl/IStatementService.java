package com.example.nagarrotask.service.Impl;

import com.example.nagarrotask.config.TextToDecimal;
import com.example.nagarrotask.entities.Statement;
import com.example.nagarrotask.mapper.StatementMapper;
import com.example.nagarrotask.service.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class IStatementService implements StatementService {

    @Autowired
    private StatementMapper statementMapper;

    @Override
    public List<Statement> findAll() {
        return statementMapper.findAll();
    }

    @Override
    public List<Statement> getAmount_between(String amount1, String amount2) {
        BigDecimal dec1 = TextToDecimal.toBigDecimal(amount1);
        BigDecimal dec2 = TextToDecimal.toBigDecimal(amount2);
        return statementMapper.getAmount_between(dec1, dec2);
    }

    @Override
    public List<Statement> getData_between(String fromDate, String toDate) {
        BigDecimal dec1 = TextToDecimal.toBigDecimal(fromDate);
        BigDecimal dec2 = TextToDecimal.toBigDecimal(toDate);
        return statementMapper.getData_between(dec1, dec2);
    }

//    @Override
//    public List<Statement> getData_between(LocalDate fromDate, LocalDate toDate) {
//        return statementMapper.getData_between(fromDate, toDate);
//    }
}
