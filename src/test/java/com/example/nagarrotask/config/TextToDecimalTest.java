package com.example.nagarrotask.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class TextToDecimalTest {

    @Test
    void testToBigDecimal() {
        BigDecimal result = TextToDecimal.toBigDecimal("5.000000899999999859346644370816648006439208984375");
        Assertions.assertEquals(new BigDecimal(5.000000899999999859346644370816648006439208984375), result);
    }
}

