package ru.codeWars.sumofDigits;

public class SumofDigits {
//    Digital root is the recursive sum of all the digits in a number.
//
//    Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing
//    in this way until a single-digit number is produced. The input will be a non-negative integer.
//
//    Examples
//    16  -->  1 + 6 = 7
//            942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//            132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6

    public static int digital_root(int n) {
        boolean isEquals = true;
        while (isEquals) {
            String nString = Integer.toString(n);
            char[] nChar = nString.toCharArray();
            int[] nArr = new int[nChar.length];
            for (int i = 0; i < nChar.length; i++) {
                nArr[i] = Character.getNumericValue(nChar[i]);
            }
            int nTemp = 0;
            for (int i = 0; i < nArr.length; i++) {
                nTemp = nTemp + nArr[i];
            }
            n = nTemp;
            nString = Integer.toString(n);
            nChar = nString.toCharArray();
            if (nChar.length > 1) {
                isEquals = true;
            } else {
                isEquals = false;
            }

        }
        return n;
    }



    public static void main(String[] args) {
        System.out.println(digital_root(456));
    }

}
