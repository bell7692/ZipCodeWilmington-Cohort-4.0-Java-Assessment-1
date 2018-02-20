package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
       int numberOfJumps = 0;
        if (k<j) {
            numberOfJumps = k;
            }
            else if (k == j){
            numberOfJumps = 1;
        }
        else if(k >j){
            long num =  (long)(k/j); //divide and get the whole num
            long num1 = j*num;  //get the whole num and multiply by j
            numberOfJumps = (int) ((k-num1)+num); //get the difference and add to num
        }
        return numberOfJumps;
    }
}
