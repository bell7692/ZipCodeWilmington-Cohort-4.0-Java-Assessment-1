package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        Integer countOfPalindromes = 0;
        for(int i = 0; i < input.length(); i++){
            for (int n = i+1; n <= input.length(); n++){
                StringBuilder subStrings = new StringBuilder(input.substring(i,n));
                subStrings.reverse();
                if(input.substring(i,n).equals(subStrings.toString())){
                    countOfPalindromes++;
                    //within the loop, takes one substring and reverses it and add to the count
                }
            }
        }
     return countOfPalindromes;
    }

}
