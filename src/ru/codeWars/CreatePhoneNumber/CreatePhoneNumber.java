package ru.codeWars.CreatePhoneNumber;

import java.util.stream.IntStream;

public class CreatePhoneNumber {
//    Write a function that accepts an array of 10 integers (between 0 and 9),
//    that returns a string of those numbers in the form of a phone number.
//
//    Example:
//            Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
//        String numbersString = new String();
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0) {
//                numbersString = numbersString + "(" + numbers[i];
//            }
//            else if (i == 2) {
//                numbersString = numbersString + numbers[i] + ") ";
//            }
//            else if (i == 5) {
//                numbersString = numbersString + numbers[i] + "-";
//            }
//            else {
//                numbersString = numbersString + numbers[i];
//            }
//
//        }
//        return numbersString;
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
