package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Preet
 */
public class StringCalculatorTest {
    public StringCalculator CalcObj;
    
    public StringCalculatorTest() {
        CalcObj = new StringCalculator();
    }
    /**
     * Test of Add method, of class StringCalculator.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        assertEquals(0,CalcObj.Add(""));
    }
    
}
