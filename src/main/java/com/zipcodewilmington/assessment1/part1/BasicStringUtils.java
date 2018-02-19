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

        StringBuilder myString = new StringBuilder();
        myString.append(str.substring(0,1).toUpperCase());
        myString.append(str.substring(1));
        myString.toString();

        return String.valueOf(myString);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return reversedStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        StringBuilder myString = new StringBuilder();
        myString.append(reversedStr.substring(0,1).toUpperCase());
        myString.append(reversedStr.substring(1));
        myString.toString();

        return String.valueOf(myString);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String reversedStr = new StringBuilder(str).substring(1, str.length()-1).toString();
        return reversedStr;
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
