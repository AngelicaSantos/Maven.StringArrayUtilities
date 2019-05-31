package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }


    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[8];
    }


    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[7];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        Boolean exists = false;
        for (String eachElement : array) {

            if (eachElement.equals(value)) ;
            {
                exists = true;
            }
        }
        return exists;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] reversedArray = new String[array.length];
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            reversedArray[length - 1] = array[i];
            length = length - 1;


        }

        return reversedArray;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] array2 = reverse(array);
        return (array2 == array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {

                count++;
            }
        }


        return count;
    }



    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] array2 = new String[array.length - 1];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (!(array[i].equals(valueToRemove))) {
                array2[counter] = array[i];
                counter++;
            }
        }
        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
       ArrayList<String> newArray = new ArrayList<String>();
       newArray.add(array[0]);
       String last = array[0];

       for(int i=1; i<array.length;i++) {
           String nextWord = array [i];
           if(nextWord.equals(last)) {
               newArray.set(newArray.size()-1,newArray.get(newArray.size()-1));
           } else {
               newArray.add(nextWord);
               last=nextWord;
           }
       }

        return newArray.toArray(new String[newArray.size()-1]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArr = new ArrayList<String>();

        newArr.add(array[0]);
        String last = array[0];

        for (int i = 1; i < array.length; i++) {

            String nextWord = array[i];

            if(nextWord.equals(last)) {

                newArr.set(newArr.size()-1, newArr.get(newArr.size()-1)+nextWord);

            } else {

                newArr.add(nextWord);
                last = nextWord;
            }
        }
        return newArr.toArray(new String[newArr.size()-1]);
    }
    }



