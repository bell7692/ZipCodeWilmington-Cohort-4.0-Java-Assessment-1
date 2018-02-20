package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        StringBuilder subStrings = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            for (int n = i+1; n <= input.length(); n++){
                subStrings.append(input.substring(i,n) + " ");
            }
        }
        subStrings.deleteCharAt(subStrings.length()-1);
        Integer countOfPalindromes = 0;
        String [] subStringsInRegularOrder = subStrings.toString().split(" ");
        String[] reversedSubStrings = subStrings.reverse().toString().split(" ");
        for (int k = 0; k < subStringsInRegularOrder.length; k++){
            if (subStringsInRegularOrder[k].equalsIgnoreCase(reversedSubStrings[k])){
                countOfPalindromes++;
            }
        }



        return countOfPalindromes;
    }

}
