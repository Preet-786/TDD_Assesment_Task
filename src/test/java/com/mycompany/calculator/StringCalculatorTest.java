package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Preet
 */
public class StringCalculatorTest {
    public StringCalculator calcObj;
    
    public StringCalculatorTest() {
        calcObj = new StringCalculator();
    }
    /**
     * Test of Add method, of class StringCalculator.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        //1st test cases
        assertEquals(0,calcObj.Add(""));
        assertEquals(3,calcObj.Add("3"));
        assertEquals(5,calcObj.Add("1,4"));
    }
    
}
