package ru.codeWars.yourOrderPlease;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class YourOrderPlease {
//    Your task is to sort a given string. Each word in the string will contain a single number.
//    This number is the position the word should have in the result.
//
//    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//    If the input string is empty, return an empty string.
//    The words in the input String will only contain valid consecutive numbers.
//
//    Examples
//        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//        ""  -->  ""

    public static String order(String words) {
        if (words.equals(" ")){
            return words;
        }
        String [] wordsArr = words.split(" ");
        String [] orderArr = new String[wordsArr.length];
        for (int i = 0; i < wordsArr.length; i++) {
            for (int j = 0; j < wordsArr.length; j++) {
                String iS = String.valueOf(i+1);
                if (wordsArr[j].contains(iS)) {
                    orderArr[i] = wordsArr[j];
                    break;
                }
            }
        }
        String twords = new String();
        for (int i = 0; i < orderArr.length; i++) {
            if (i == 0){
                twords = twords + orderArr[i];
            }
            else {
                twords = twords + " " + orderArr[i];
            }
        }
        words = twords;
        return words;


    }

    public static void main(String[] args) {
        System.out.println(order(" "));
    }

}
