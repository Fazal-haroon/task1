package com.example.nagarrotask.service.Impl;

import com.example.nagarrotask.entities.Statement;
import com.example.nagarrotask.mapper.StatementMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class IStatementServiceTest {
    @Mock
    StatementMapper statementMapper;
    @InjectMocks
    IStatementService iStatementService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(statementMapper.findAll()).thenReturn(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")));

        List<Statement> result = iStatementService.findAll();
        Assertions.assertEquals(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")), result);
    }

    @Test
    void testGetAmount_between() {
        when(statementMapper.getAmountBetween(any(), any())).thenReturn(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")));

        List<Statement> result = iStatementService.getAmountBetween("amount1", "amount2");
        Assertions.assertEquals(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")), result);
    }

    @Test
    void testGetData_between() {
        when(statementMapper.getDateBetween(any(), any())).thenReturn(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")));

        List<Statement> result = iStatementService.getDateBetween("10", "20");
        Assertions.assertEquals(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")), result);
    }
}

