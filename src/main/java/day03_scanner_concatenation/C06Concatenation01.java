package day03_scanner_concatenation;

public class C06Concatenation01 {

    public static void main(String[] args) {

        //Concatenation is an operation to join Strings with Strings or
        //join Strings with other data types
        //Symbol of Concatenation is "+" as same as in addition operation

        System.out.println("Tom " + "Hanks");
        System.out.println("Tom" + " Hanks");
        System.out.println("Tom" + " " + "Hanks");

        System.out.println("Tom" + 3 + 2); //Tom32
        System.out.println("Tom" + (3 + 2)); //Tom5

        //Multiplication is done before addition that is why the result is Tom6
        System.out.println("Tom" + 3*2); //Tom6

        System.out.println(3+2+"Tom");//5Tom

        System.out.println(3 * 2 + 4 + "Tom" + 5 + 6); //10Tom56


    }

}
