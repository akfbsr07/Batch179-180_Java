package day20_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    1)"throw" is used inside the method body
      "throws" is used in the same line with the method name

    2)"throw" can be used multiple times in a method body,
      but "throws" can be used just once in a method

    3)"throw" is for throwing exceptions for some specific condition
      "throws" is for throwing exceptions, it is used for Compile Time Exceptions mostly

    4)"throw" uses Exception Object,
      "throws" uses Exception Class Name

    5)After "throw" you can use just a single Exception Object
      after "throws" you can use many Exception Class Names
 */

public class C02Exceptions {

    public static void main(String[] args) {

        printAge(23);
        printAge(-23);

    }

    //Create a method print the user's age

    public static void printAge(int age){
        if (age>=0){
        System.out.println(age);
        }else {
            throw new IllegalArgumentException("Age can not be negative");
        }
    }

    //Create a method to read text in a text file.
    public static void findAndReadTheFile() throws IOException {


            //To access the file
            FileInputStream fis = new FileInputStream("C:\\Users\\Akif\\IdeaProjects\\Batch179-180\\src\\main\\java\\day20_exceptions\\MyFile.txt");

            //To read the file
            int k = 0;
            while((k=fis.read()) != -1){
                System.out.print((char)k);
            }
    }



}





