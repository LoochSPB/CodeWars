package ru.codeWars.BreakCamelCase;

public class BreakCamelCase {
//    Complete the solution so that the function will break up camel casing, using a space between words.
public static String camelCase(String input) {
    String answer = new String();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                answer = answer + " " + input.charAt(i);
            }
            else {
                answer = answer + input.charAt(i);
            }
        }
    return answer;
}


}
