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
        else{
            String seprator = ",";
            if(numbers.matches("//(.*)\n(.*)")){
                    seprator = Character.toString(numbers.charAt(2));
                    numbers = numbers.substring(4);
            }
            String nums[] = numbers.split(seprator+"|\n");
            return findSum(nums);
        }
    }
    
    private int stringToInt(String str){
        return Integer.parseInt(str);
    }
    
    private int findSum(String[] nums){
        String negValues = "";
        int addition = 0;
        for(String value: nums){
            if(stringToInt(value) < 0) negValues += ", "+value;
            addition += stringToInt(value);
        }
        if(!negValues.isEmpty()){
            throw new IllegalArgumentException("Negatives not allowed: " + negValues.substring(2));
        }
        return addition;
    }
}
