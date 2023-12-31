package day06_string_manipulations_loops;

public class C01StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Make the all digits except last 4 digits of a credit card invisible by using "*"
        //           1234 1234 1234 1234 ==> **** **** **** 1234

        String ccNum = "1234 1234 1234 1234";

        String hiddenccNum = ccNum.substring(0, 14).replaceAll("[0-9]","*").concat(ccNum.substring(14));

        System.out.println(hiddenccNum);


        //Example 2: Count the number of characters different from space were used in a String
        //           "   Tom Hanks was born in 1975.  "

        String sentence = "   Tom Hanks was born in 1975.  ";

        int numOfCharDiffFromSpace = sentence.replace(" ", "").length();

        System.out.println(numOfCharDiffFromSpace); //22

        /*
           concat(): It is for joining two Strings like + sign

           replace(char, char) or replace(String, String): It is used to replace single character or multiple characters
           note: If you need to use regex use replaceAll() otherwise use replace()
         */


    }

}
