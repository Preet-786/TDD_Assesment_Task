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
        //1st test case
        testNumbers();
        
        //2nd test case
        testMoreThanOne();
        
        //3rd test case
        testSeprator();
        
        //4th test case
        testUserDefinedSeprator();
       
        //5th and 6th test case
        testNegative();

    }
    
    @Test
    public void testNumbers(){
        assertEquals(0,calcObj.Add(""));
        assertEquals(3,calcObj.Add("3"));
        assertEquals(5,calcObj.Add("1,4"));
    }
    
    @Test
    public void testMoreThanOne(){
        assertEquals(19,calcObj.Add("1,4,6,8"));
        assertEquals(10,calcObj.Add("2,2,2,2,2"));
    }
    
    @Test
    public void testSeprator(){
        assertEquals(4,calcObj.Add("2\n2"));
        assertEquals(10,calcObj.Add("1\n4\n5"));
    }
    
    @Test
    public void testUserDefinedSeprator(){
        assertEquals(3,calcObj.Add("//;\n1;2"));
        assertEquals(12,calcObj.Add("//!\n1!2!4!5"));
    }
    
    @Test
    public void testNegative(){
    	try{
            calcObj.Add("-4,2");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -4");
        }
        
        try{
            calcObj.Add("2,3,-2,-9,7,-3");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -2, -9, -3");
        }
    }
}
