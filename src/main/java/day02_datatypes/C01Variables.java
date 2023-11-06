package day02_datatypes;

import java.sql.SQLOutput;

public class C01Variables {

    public static void main(String[] args) {

        byte stdAge = 25;

        System.out.println(stdAge);

        short numOfStudentInHighSchool = 3245;

        System.out.println(numOfStudentInHighSchool);

        int popOfMiami = 1200000;

        System.out.println(popOfMiami);

        //If you create "long" variable, use "L" at the end of the value when the value is out of the int range

        long popOfWorld = 7000000000L;

        System.out.println(popOfWorld);

        //If you create "long" variable, do not use "L" at the end of the value when the value is inside the int range

        long popOfChina = 1500000000;

        System.out.println(popOfChina);

        float shirtPrice = 23.99F;

        System.out.println(shirtPrice);

        double weightOfACell = 0.000000012;

        System.out.println(weightOfACell);

        boolean isRetired = false;

        System.out.println(isRetired);

        char initial = 'A';

        System.out.println(initial);

        String stdName = "Mark Twain";

        System.out.println(stdName);


    }

}
