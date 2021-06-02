package ch.bbw;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculatorTest;

    @Test
    public void sum() {
        calculatorTest = new Calculator();
        assertTrue(calculatorTest.sum(3,4) == 7);
    }

    @Test
    public void positiveSub(){
        calculatorTest = new Calculator();
        assertTrue(calculatorTest.subtraktion(50,40) == 10);
    }
}