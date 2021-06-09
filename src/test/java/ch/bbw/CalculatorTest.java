package ch.bbw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculatorTest;

    @Before
    public void setUP() {
        calculatorTest = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveisOK() {
        assertTrue(calculatorTest.sum(3, 4) == 7);
    }

    @Test
    public void testDifferenzZweiPositiveisOK() {
        assertTrue(calculatorTest.subtraktion(50, 40) == 10);
    }
}