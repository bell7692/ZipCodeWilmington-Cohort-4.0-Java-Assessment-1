package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        return new StringBuilder().append(str.substring(0,1).toUpperCase()+str.substring(1)).toString();


    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {


        return BasicStringUtils.camelCase(BasicStringUtils.reverse(str));
        //reverse frst then camelCase
        //return BasicStringUtils.reverse(BasicStringUtils.camelCase(str));
        //camelCase then reverse because camelcase is inside the parenthesis so it will come first
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String[] strArr = str.split("");
        StringBuilder newString = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            //if it is uppercase
            if (strArr[i].equals(strArr[i].toUpperCase())) {
                newString.append(strArr[i].toLowerCase());
            } else if (strArr[i].equals(strArr[i].toLowerCase())) {
                newString.append(strArr[i].toUpperCase());

            } else {
                newString.append(" ");
            }
        }
        return newString.toString();

}
}
