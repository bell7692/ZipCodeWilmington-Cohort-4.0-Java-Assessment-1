package com.zipcodewilmington.assessment1.part2;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        return deleteMultiplesOfN(ints, 2);
        //OR
//        ArrayList<Integer> result = new ArrayList<>();
//        for(Integer idx : ints){
//            if (idx % 2 != 0){
//                result.add(idx);
//            }
//        }
//        return result.toArray(new Integer[0]);
//OR
//        Integer count = 0;
//        for (int i = 0; i < ints.length; i++){
//            if (ints[i] %2 != 0){
//                count++;
//            }
//        }
//        Integer [] noEvenNumbersArr = new Integer[count];
//        Integer noEvenArrIndex = 0;
//        for (int i = 0; i < ints.length; i++){
//            if (ints[i] %2 != 0){
//                noEvenNumbersArr[noEvenArrIndex]= ints[i];
//                noEvenArrIndex++;
//            }
//        }
//        return noEvenNumbersArr;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer idx : ints){
            if (idx % 2 == 0){
                result.add(idx);
            }
        }
        return result.toArray(new Integer[0]);
        //OR
//        Integer count = 0;
//        for (int i = 0; i < ints.length; i++){
//            if (ints[i] % 2 == 0){
//                count++;
//            }
//        }
//        Integer [] noOddNumbersArr = new Integer[count];
//        Integer noEvenArrIndex = 0;
//        for (int i = 0; i < ints.length; i++){
//            if (ints[i] %2 == 0){
//                noOddNumbersArr[noEvenArrIndex]= ints[i];
//                noEvenArrIndex++;
//            }
//        }
//        return noOddNumbersArr;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
      return deleteMultiplesOfN(ints, 3);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer idx : ints){
            if (idx % multiple != 0){
                result.add(idx);
            }
        }
        return result.toArray(new Integer[0]);
    }
//        Integer count = 0;
//        for (int i = 0; i < ints.length; i++){
//            if (ints[i] %multiple != 0){
//                count++;
//            }
//        }
//        Integer [] noEvenNumbersArr = new Integer[count];
//        Integer noEvenArrIndex = 0;
//        for (int i = 0; i < ints.length; i++){
//            if (ints[i] %multiple != 0){
//                noEvenNumbersArr[noEvenArrIndex]= ints[i];
//                noEvenArrIndex++;
//            }
//        }
//        return noEvenNumbersArr;     }
}
