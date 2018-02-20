package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i] == objectToCount){
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer count = 0;
        for(int i = 0; i < objectArray.length; i++){
            if(!objectArray[i].equals(objectToRemove)){
                count++;
            }
        }
        Integer valuesRemovedIndex = 0;

        Object [] valuesRemovedArr = new Object[count];
        for (int k = 0; k < objectArray.length; k++) {
            if (!objectArray[k].equals(objectToRemove)) {
                valuesRemovedArr[valuesRemovedIndex] = objectArray[k];
                valuesRemovedIndex++;
            }

        }
            return valuesRemovedArr;


    }






    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Object, Integer> myMap = new HashMap<>();
        for (Object i : objectArray){
            if (myMap.containsKey(i)){
                myMap.put(i, myMap.get(i)+1);
            }
            else {
                myMap.put(i, 1);
            }
        }
        Integer myValue = 1;
        Object myKey = 0;
        Set<Map.Entry<Object, Integer>> myEntrySet = myMap.entrySet();
        for (Map.Entry<Object, Integer> entry :myEntrySet){
            if (entry.getValue() > myValue){
                myKey = entry.getKey();
                myValue= entry.getValue();
            }
        }
        return myKey;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Map<Object, Integer> myMap = new HashMap<>();
        for (Object i : objectArray){
            if (myMap.containsKey(i)){
                myMap.put(i, myMap.get(i)+1);
            }
            else {
                myMap.put(i, 1);
            }
        }
        Integer myValue = 1;
        Object myKey = 0;
        Set<Map.Entry<Object, Integer>> myEntrySet = myMap.entrySet();
        for (Map.Entry<Object, Integer> entry :myEntrySet){
            if (entry.getValue() <= myValue){
                myKey = entry.getKey();
                myValue= entry.getValue();
            }
        }
        return myKey;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
       Object [] mergedArr = new Object[objectArray.length + objectArrayToAdd.length];
       Integer mergedArrIndex = 0;
       for(int i = 0; i < objectArray.length; i++){
           mergedArr[mergedArrIndex]= objectArray[i];
           mergedArrIndex++;
       }
        for(int i = 0; i < objectArrayToAdd.length; i++){
            mergedArr[mergedArrIndex]= objectArrayToAdd[i];
            mergedArrIndex++;
        }
        Arrays.sort(mergedArr);

       return mergedArr;
    }
}
