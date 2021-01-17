package ru.codeWars.osAndXs;

public class OsAndXs {
    public static void main(String[] args) {
        System.out.println(isXsAndOsEquals("xxooOOXx"));
    }

    public static boolean isXsAndOsEquals (String message) {
        int xCounter = 0;
        int oCounter = 0;
        char[] letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ('x') || letters[i] == ('X')) {
                xCounter = xCounter + 1;
            }
            if (letters[i] == ('o') || letters[i] == ('O')) {
                oCounter = oCounter + 1;
            }
        }
        return oCounter == xCounter;
    }



}
