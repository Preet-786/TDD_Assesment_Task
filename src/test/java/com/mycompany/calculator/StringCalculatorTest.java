/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        assertEquals(0,CalcObj.Add("3"));
    }
    
}
