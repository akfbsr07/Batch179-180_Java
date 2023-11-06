package day11_array_lists_method_creation_method_overloading_varargs_pass_by_value;

public class C02MethodCreation01 {

    public static void main(String[] args) {

        //Method Call: Using a method in main method is called "Method Call"
        System.out.println(add(3, 5));;

        System.out.println(multiplyThreeNumbers(7, 11, 13));

        System.out.println(joinThreeStrings("Java", " is ", "Easy"));

    }

    public static int add(int a, int b){

        return  a+b;

    }

    //Create a method to multiply 3 numbers
    public static double multiplyThreeNumbers(double a, double b, double c){

        return a*b*c;

    }

    //Create a method that joins two Strings
    public static String joinThreeStrings(String a, String b, String c){

        return a.concat(b).concat(c);

    }

    //Note: Variables used in method creation are called Parameters
    //      Actual values used in method call are called Arguments









}
