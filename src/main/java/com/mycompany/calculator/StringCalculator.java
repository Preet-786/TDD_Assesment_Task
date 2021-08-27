/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

/**
 *
 * @author Preet
 */
public class StringCalculator {
    
    public int Add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        return Integer.parseInt(numbers);
    }
    
    private int stringToInt(String str){
        return Integer.parseInt(str);
    }
}
