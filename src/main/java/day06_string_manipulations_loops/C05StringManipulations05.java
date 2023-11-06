package day06_string_manipulations_loops;

public class C05StringManipulations05 {

    public static void main(String[] args) {

        // Example 6: Type code to find the number of punctuation marks used in a String

        String s = "Wooow!... Tom is! ! 13, ... and he is in university...";

        int numOfPuncts = s.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println("Total number of punctuation marks: " + numOfPuncts);


        // Example 7: Type a code to find number of words in a String
        //            "Learn Java, earn money."

        String s2 = "Learn Java in patience, you will earn huge amount of money.";

        int numOfWords = s2.split(" ").length;
        System.out.println("Total number of words: " + numOfWords);


        // Example 8: Type a code to find the number of letters used in a String
        //            "Learn Java in patience, you will earn huge amount of money."

        String s3 = "Learn Java in patience, you will earn huge amount of money.";

        int numOfLetters = s3.replaceAll("[^A-Za-z]", "").split("").length;
        System.out.println("Total number of letters: " + numOfLetters);



    }

}
