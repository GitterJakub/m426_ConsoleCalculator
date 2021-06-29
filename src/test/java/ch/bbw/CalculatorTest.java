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

    //Summe
    @Test
    public void testSummeZweiPositiveisOK() {
        assertTrue(calculatorTest.sum(3, 4) == 7);
    }

    @Test
    public void testSummePositveNegativeisOK() {
        assertTrue(calculatorTest.sum(30, -14) == 16);
    }

    @Test
    public void testSummeZweiNegativeisOK() {
        assertTrue(calculatorTest.sum(-10, -33) == -43);
    }

    @Test
    public void testSummeMaxIntegerisFalse(){
        assertFalse(calculatorTest.sum(Integer.MAX_VALUE, 1) > Integer.MAX_VALUE);
    }

    @Test
    public void testSummeMinIntegerisFalse(){
        assertFalse(calculatorTest.sum(Integer.MIN_VALUE, -1) < Integer.MIN_VALUE);
    }

    @Test
    public void testSummeKommazahlenisFalse(){
        assertFalse(calculatorTest.sum(4,(int) 3.4) == 7.4);
    }

    @Test
    public void testSummeOperatorDivisionisFalse(){
        assertFalse(calculatorTest.sum(3/4, 4/2) == 2.75);
    }
    @Test
    public void testSummeOperatorMultiplikationisOK(){
        assertTrue(calculatorTest.sum(3*2, 4*5) == 26);
    }

    //Differenz
    @Test
    public void testDifferenzZweiPositiveisOK() {
        assertTrue(calculatorTest.subtraktion(50, 40) == 10);
    }

    @Test
    public void testDifferenzZweiNegativeisOK() {
        assertTrue(calculatorTest.subtraktion(-20, -7) == -13);
    }

    @Test
    public void testDifferenzPositiveNegativeisOK() {
        assertTrue(calculatorTest.subtraktion(55, -19) == 74);
    }

    @Test
    public void testDifferenzMaxIntegerisFalse(){
        assertFalse(calculatorTest.subtraktion(Integer.MAX_VALUE, -1) > Integer.MAX_VALUE);
    }

    @Test
    public void testDifferenzMinIntegerisFalse(){
        assertFalse(calculatorTest.subtraktion(Integer.MIN_VALUE, 1) < Integer.MIN_VALUE);
    }

    @Test
    public void testDifferenzKommazahlenisFalse(){
        assertFalse(calculatorTest.subtraktion(4, (int) 3.4) == 2.6);
    }

    @Test
    public void testDifferenzOperatorDivisionisFalse(){
        assertFalse(calculatorTest.subtraktion(3/4, 4/2) == -1.25);
    }

    @Test
    public void testDifferenzOperatorMultiplikationisOK(){
        assertTrue(calculatorTest.subtraktion(3*2, 4*5) == -14);
    }

    //Quotient
    @Test(expected = ArithmeticException.class)
    public void testDivisondurchNullisExceptionExpected() {
        calculatorTest.division(5, 0);
    }

    @Test
    public void testDivisondurchNullisExceptionUnexpected()
            throws ArithmeticException {
        calculatorTest.division(10, 5);
    }

    @Test
    public void testDivisionPositiveNegativeisOK(){
        assertTrue(calculatorTest.division(50, -10) == -5);
    }

    @Test
    public void testDivisionZweiPositiveisOK(){
        assertTrue(calculatorTest.division(20, 10) == 2);
    }

    @Test
    public void testDivisionZweiNegativeisOK(){
        assertTrue(calculatorTest.division(-70, -7) == 10);
    }

    @Test
    public void testDivisionKommazahlenisFalse(){
        assertFalse(calculatorTest.division(35, 10) == 3.5);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionOperatorDivisionisException(){
        calculatorTest.division(6/3, 1/2);
    }

    @Test
    public void testDivisionOperatorMultiplikationisOK(){
        assertTrue(calculatorTest.division(9*3, 3*3) == 3);
    }


}