package com.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals("test failed", 3, calculator.add(1,2));
    }

    @After
    public void tearDown() throws Exception {
    }
}