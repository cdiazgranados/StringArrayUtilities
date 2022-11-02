package com.zipcodewilmington;

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
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (String s : array) {
            if (value.equals(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] array2 = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[(array.length - i) - 1];
        }

        System.out.println(array2);
        return array2;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(array[(array.length - i) - 1])) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        String joinedArray = sb.toString();
        joinedArray = joinedArray.toLowerCase();
        joinedArray.replaceAll(" ", "");



        for (int i = 0; i < alpha.length(); i++) {
            if (!joinedArray.contains(String.valueOf(alpha.charAt(i)))) {
                return false;
            }
        }

        return true;

//        String alpha = "abcdefghijklmnopqrstuvwxyz";
//        String[] sa = alpha.split("");
//
//
//        for (String c : sa) {
//            for (String f : array) {
//                if (!f.contains(c)) {
//                    return false;
//                }
//            }
//
//        }
//
//        return true;


//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < array.length; i++) {
//            sb.append(array[i]);
//        }
//        String str = sb.toString();
//        StringBuilder builderAlpha = new StringBuilder(alpha);
//
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < str.length(); j ++) {
//                if (str.charAt(i) == builderAlpha.charAt(j)) {
//                    builderAlpha = builderAlpha.deleteCharAt(j);
//                }
//            }
//        }
//
//       if (alpha.length() == 0) {
//           return true;
//       }
//        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
