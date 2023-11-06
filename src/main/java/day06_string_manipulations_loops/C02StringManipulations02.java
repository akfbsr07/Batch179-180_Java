package day06_string_manipulations_loops;

public class C02StringManipulations02 {

    public static void main(String[] args) {

        //Example 3 (Interview Question): Type code to print just the unique characters in a String
        //           "Hello" ==> Heo

        String s = "Hello";

        int indexOfH = s.indexOf("H");
        int lastIndexOfH = s.lastIndexOf("H");

        int indexOfE = s.indexOf("e");
        int lastIndexOfE = s.lastIndexOf("e");

        int indexOfL = s.indexOf("l");
        int lastIndexOfL = s.lastIndexOf("l");

        int indexOfO = s.indexOf("o");
        int lastIndexOfO = s.lastIndexOf("o");

        if (indexOfH==lastIndexOfH){
            System.out.print("H");
        }

        if (indexOfE==lastIndexOfE){
            System.out.print("e");
        }

        if (indexOfL==lastIndexOfL){
            System.out.print("l");
        }

        if (indexOfO==lastIndexOfO){
            System.out.print("o");
        }







    }

}
