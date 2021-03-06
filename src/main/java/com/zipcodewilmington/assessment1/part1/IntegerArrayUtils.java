package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
       Integer sumOfNum = 0;
        for (int i = 0; i < intArray.length; i++){
           sumOfNum += intArray[i];
           //for(int num : intArray){
            //sumOfNum+=num;
       }
        return sumOfNum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer sumOfNum = 1;
        for (int i = 0; i < intArray.length; i++){
            sumOfNum *= intArray[i];
        }
        return sumOfNum;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
       // Double sumOfNum = 0.0;
//        for (int i = 0; i < intArray.length; i++){
//            sumOfNum += intArray[i];
//        }
//
//        return sumOfNum/intArray.length;

        return getSum(intArray)/(double)intArray.length;
    }
}
