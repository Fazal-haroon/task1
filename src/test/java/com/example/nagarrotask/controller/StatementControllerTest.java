package com.example.nagarrotask.controller;

import com.example.nagarrotask.entities.Statement;
import com.example.nagarrotask.service.Impl.IStatementService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class StatementControllerTest {
    @Mock
    IStatementService statementService;
    @InjectMocks
    StatementController statementController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAll() {
        when(statementService.findAll()).thenReturn(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")));

        List<Statement> result = statementController.getAll();
        Assertions.assertEquals(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")), result);
    }

    @Test
    void testGetData_between() {
        when(statementService.getData_between(anyString(), anyString())).thenReturn(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")));

        List<Statement> result = statementController.getData_between("fromDate", "toDate");
        Assertions.assertEquals(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")), result);
    }

    @Test
    void testGetAmount_between() {
        when(statementService.getAmount_between(anyString(), anyString())).thenReturn(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")));

        List<Statement> result = statementController.getAmount_between("amount1", "amount2");
        Assertions.assertEquals(List.of(new Statement(1, 3, "09.08.2020", "535.197875027054")), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme