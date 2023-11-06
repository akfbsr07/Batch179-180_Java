package day05_ternary_operator_string_manipulations;

public class C03StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Count the alphabetical characters in a given String
        //           Tom12 Hanks!... ==> 8

        //Remove non-alphabetical characters,  Count the remaining characters

        //non-alphabetical characters are a group of data
        //To work with a group of data we use "Regular Expressions" (Regex)

        /*
            Upper case letters: [A-Z]
            Lower case letters: [a-z]
            All letters: [A-Za-z]
            All digits: [0-9]
            Letters from m to v: [m-v]
            Regex for a, b, e, d, g, z: [abedgz]

            All characters different from upper case letters: [^A-Z]
            All characters different from lower case letters: [^a-z]
            All characters different from all letters: [^A-Za-z]
            All characters different from digits: [^0-9]
            All symbols(Different from letters and digits): [^A-Za-z0-9]

            All punctuation marks: \p{Punct}
         */

        String s1= "Tom12xxX XXX Hanks!13...";

        int numOfChars = s1.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfChars);

        // replaceAll() ==> It changes a group of characters to another characters
        // length() ==> Count the number of characters in a String


        // Example 2: Type code to change all digits to "*" in a given password
        //            pwd:a12b32c! ==> a**b**c!

        String pwd = "a12b32c!";

        String hiddenPwd = pwd.replaceAll("[0-9]", "*");
        System.out.println(hiddenPwd);


        // Example 3: Get initials from a full name (Middle name is out of scope)
        //            "Tom Hanks" ==> TH , "tom hanks" ==> TH , "   tOM Hanks   " ==> TH

        String name = "   tOM hAnks   ";

        String firstInitial = name.trim().substring(0, 1).toUpperCase();

        String secondInitial = name.trim().split(" ")[1].substring(0, 1).toUpperCase();

        System.out.println(firstInitial + secondInitial);


        //trim(): Removes spaces from the beginning and from the end

        //substring(s, e): It gets the part of a String."s" stands for starting index which is inclusive
        //                                              "e" stands for ending index which is exclusive

        //toUpperCase(): Changes all alphabetical characters to upper cases in a String

        //split()[]: Splits a String from given character and indexes every part



    }

}
