package day11_array_lists_method_creation_method_overloading_varargs_pass_by_value;

public class C03MethodOverloading01 {

    //Method Overloading: Methods with same name(as so same purpose), different parameters(data type or number or places)

    public static void main(String[] args) {

        add(3.2, 5 );

    }

    //Create a method adds two integers
    public static int add(int a, int b){
        return a+b;
    }

    //Create a method adds three integers
    public static int add(int a, int b, int c){
        return  a+b+c;
    }

    //Create a method adds one integer and one double
    public static double add(int a, double b){
        return a+b;
    }

    //Create a method adds one double and one integer
    public static double add(double a, int b){
        return a+b;
    }

    //Note 1: You can create many methods with the same name in a class, but method parameters must be different
    //Note 2: If you create many methods with the same name and different parameters in a class, it is called "Method Overloading"
    //Note 3: You need to make parameters different in "method overloading"
    //      To make them different you have 3 ways; 1)Change the number of parameters
    //                                              2)Change the data type of parameters
    //                                              3)Change the places of parameters, if the data types of the parameters are different
    //Note 4: You can use any access modifier in Method Overloading
    //Note 5: "Static" and "Non-static" methods can be overloaded.Being static or non-static does not affect method overloading
    //Note 6: Method Names and Method Parameters are essentials in methods.Those are called Method Signatures
    //        If you want to check two methods are same or not just check the method name and parameters
    //        Access modifiers, return types, static keyword can not make methods different from each other
    //Note 7: Java is an "Object-Oriented Programming Language"(OOP)
    //        OOP has 4 principles:
    //        1)Inheritance
    //        2)Polymorphism = Method Overloading + Method Overriding
    //        3)Encapsulation
    //        4)Abstraction





}
