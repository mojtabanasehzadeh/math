package com.rapid.math.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MathLibServiceTest {

    @Autowired
    private MathLibService mathLibService;

    @Value("${mathlib.useRecursion}")
    private boolean useRecursion;

    @Test
    public void testFactorial() {
        assertEquals(120, mathLibService.factorial(5));
        assertEquals(1, mathLibService.factorial(0));
    }

    @Test
    public void testUnevenFactorial() {
        assertEquals(105, mathLibService.unevenFactorial(7));
        assertEquals(945, mathLibService.unevenFactorial(9));
    }

    @Test
    public void testSquareFactorial() {
        assertEquals(36, mathLibService.squareFactorial(3));
        assertEquals(576, mathLibService.squareFactorial(4));
    }
}