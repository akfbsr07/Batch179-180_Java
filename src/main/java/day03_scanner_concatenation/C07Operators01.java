package day03_scanner_concatenation;

public class C07Operators01 {

    public static void main(String[] args) {

        // "=" ==> Assignment Operator ==> Takes the value from the right and puts it into the container on the left

        // "==" ==> Equality Operator ==> Checks if the value on the left is the same with value on the right
        //          2+3 == 5 ==> true , 2+4 == 3 ==> false so "==" in Java returns boolean
        //          'A' == 65 ==> If you use char with any mathematical operation in Java uses the ASCII value of the char

        System.out.println('A' == 65); //true

        System.out.println('A' + 'a'); //162 ==> Because, If you use char with any mathematical operation in Java uses the ASCII value of the char

        //Example: Find ASCII value of "!" by typing code
        System.out.println('!' + 0); //33

        // "!" ==> Not Operator ==> !true=false , !false=true , !!true=true

        // "!=" ==> Not Equals operator
        // 2+3 != 7 ==> true

        System.out.println( 2+3 != 7);
        System.out.println(4+3 != 7);

        // "<" , ">" , "<=" , ">="  all of them return boolean

        /*
            "==" with Strings
            Every String has two main things 1)Value 2)Address
         */

        String s1 = "Tom";
        String s2 = "Hanks";
        String s3 = "Tom";
        String s4 = new String("Tom"); //Create a new String from scratch without looking the Strings that already exist

        System.out.println(s1==s2); //false

        System.out.println(s1==s3); //true

        System.out.println(s1==s4); //false ==> Value is same but addresses are different

        System.out.println(s1.equals(s4)); //true ==> it will be true because it is just checking the values but not the addresses

        //When we compare two Strings in coding we use "equals()" method because value is important for us not the address
        //so do not use "==" sign when compare to Strings

    }

}
