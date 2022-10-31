package com.example.nagarrotask.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class TextToDecimalTest {

    @Test
    void testToBigDecimal() {
        BigDecimal result = TextToDecimal.toBigDecimal("5.000.0009");
        Assertions.assertEquals(new BigDecimal(50000009), result);
    }
}

