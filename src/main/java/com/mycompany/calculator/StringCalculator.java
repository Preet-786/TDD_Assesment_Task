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
        else if(numbers.startsWith("//[")){
            
            String nums[] = findArray(numbers);
            return findSum(nums);
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
    
    private String[] findArray(String inputs){
        // This function will give arrys of string seprated by given seprators
        
        int i=2;
        String seprator="";
        while(inputs.charAt(i)!='\n'){
            int start=i+1;
            while(inputs.charAt(i+1)!=']')
                i++;
            seprator+=("|" + inputs.substring(start,i+1));
            i+=2;
        }
        seprator = '[' + seprator.substring(1) + "|\n" + ']';
        inputs=inputs.substring(i+1);
        String nums[]=inputs.split(seprator);
        return nums;
    }
    
    private int stringToInt(String str){
        return Integer.parseInt(str);
    }
    
    private int findSum(String[] nums){
        String negValues = "";
        int addition = 0;
        for(String value: nums){
            value = value.trim();
            if(value.isEmpty()) continue;
            if(stringToInt(value) < 0) negValues += ", "+value;
            else if(stringToInt(value) <= 1000) addition += stringToInt(value);
        }
        if(!negValues.isEmpty()){
            throw new IllegalArgumentException("Negatives not allowed: " + negValues.substring(2));
        }
        return addition;
    }
}
