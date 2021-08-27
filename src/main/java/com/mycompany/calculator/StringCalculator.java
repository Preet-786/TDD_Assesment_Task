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
        String[] nums = numbers.split(",");
        if(numbers.isEmpty()){
            return 0;
        }
        else if(nums.length==1){
            return stringToInt(nums[0]);
        }
        else{
            return findSum(stringToInt(nums[0]),stringToInt(nums[1]));
        }
    }
    
    private int stringToInt(String str){
        return Integer.parseInt(str);
    }
    
    private int findSum(int n1, int n2){
        return n1+n2;
    }
}
