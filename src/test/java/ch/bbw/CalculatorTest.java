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

    @Test
    public void testSummeZweiNegativeisOK(){
        assertTrue(calculatorTest.sum(-10, -33)== -43);
    }

    @Test
    public void testDifferenzZweiNegativeisOK(){
        assertTrue(calculatorTest.subtraktion(-20,-7)==-13);
    }
}