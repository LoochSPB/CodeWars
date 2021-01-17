package ru.codeWars.spinWords;

public class SpinWords {

//    Write a function that takes in a string of one or more words, and returns the same string,
//    but with all five or more letter words reversed (Just like the name of this Kata).
//    Strings passed in will consist of only letters and spaces.
//    Spaces will be included only when more than one word is present.
//    Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//    spinWords( "This is a test") => returns "This is a test"
//    spinWords( "This is another test" )=> returns "This is rehtona test"

        public static void main(String[] args) {
            System.out.println((spinWord("welcome")));
            int answer;
            String words;
//            do {
//                Scanner scan = new Scanner(System.in);
//                System.out.println("Hello! Type the word or phrase and look what will happen!");
//
//                words = scan.nextLine();
//                String[] splitWords = words.split(" ", words.length());
//                int[] charCount = new int[splitWords.length];
//                String[] finalPhrase = new String[splitWords.length];
//
//                for (int i = 0; i < splitWords.length; i++) {
//                    String countedWord = splitWords[i];
//                    charCount[i] = countedWord.length();
//                }
//                for (int i = 0; i < charCount.length; i++) {
//                    if (charCount[i] >= 3) {
//                        finalPhrase[i] = spinWord(splitWords[i]).toString();
//                    } else {
//                        finalPhrase[i] = splitWords[i];
//                    }
//                }
//                System.out.println("Here you go!");
//                for (int i = 0; i < finalPhrase.length; i++) {
//                    System.out.print(finalPhrase[i] + " ");
//                }
//                System.out.println(" ");
//                System.out.println("Try again? 1 - yes, 0 - no");
//                answer = scan.nextInt();
//            } while (answer == 1);


        }

    static String spinWord (String startWord) {
        String [] splitWords = startWord.split(" ", startWord.length());
        int [] charCount = new int[splitWords.length];
        String [] finalPhrase = new String[splitWords.length];
        String finalPhraseString = "";
        for (int i = 0; i < splitWords.length; i++) {
            String countedWord = splitWords[i];
            charCount[i] = countedWord.length();
        }
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] >= 5) {
                String splitOneWord = splitWords[i];
                StringBuilder reverseWord = new StringBuilder(splitOneWord);
                reverseWord.reverse();
                finalPhrase[i] = reverseWord.toString();

            }
            else {
                finalPhrase [i] = splitWords [i];
            }

        }
        for (int i = 0; i < finalPhrase.length; i++) {
            finalPhraseString = finalPhraseString +finalPhrase [i];
        }
        return finalPhraseString;
    }

}
