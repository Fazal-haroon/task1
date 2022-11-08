package com.example.nagarrotask.service.Impl;

import com.example.nagarrotask.config.TextToDecimal;
import com.example.nagarrotask.entities.Statement;
import com.example.nagarrotask.mapper.StatementMapper;
import com.example.nagarrotask.service.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
    public List<Statement> getAmountBetween(String amount1, String amount2) {
        BigDecimal dec1 = TextToDecimal.toBigDecimal(amount1);
        BigDecimal dec2 = TextToDecimal.toBigDecimal(amount2);
        return statementMapper.getAmountBetween(dec1, dec2);
    }

    @Override
    public List<Statement> getDateBetween(String fromDate, String toDate) {
        BigDecimal dec1 = TextToDecimal.toBigDecimal(fromDate);
        BigDecimal dec2 = TextToDecimal.toBigDecimal(toDate);
        return statementMapper.getDateBetween(dec1, dec2);
    }

}
