package day18_oop_static_keyword;

/*
    1) PARENT     -    CHILD
       Interface       Class      ==> implements
       Class           Class      ==> extends
       Interface       Interface  ==> extends

       Class           Interface  ==> This is impossible, because a class con not be a parent to an interface

    2)What is the difference between the "abstract class" and "interface"? (INTERVIEW QUESTION)
      i)Methods: Abstract Class can have Abstract and Concrete methods,
                 but interfaces can have just Abstract Methods.
                 Note: By using "static" or "default" keywords we can create "concrete" methods in an interface
                 What is the difference between "Static methods" and "Default methods" in an interface?
                 "Static methods" are static that is why we can access them by using Interface name without creating an object
                 "Default methods" need object to be accessed

                 All methods in an interface are public, but method in an abstract class can use any access modifier

      ii)Variables: All variables in an interface are public, static and final. But an abstract class can have any type of variable

      iii)Interface: Java does not support multiple Inheritance through classes, but Java supports multiple Inheritance through Interfaces

      iv)Usage: When we need multiple parents contain the mandatory functionalities we use interfaces
                If a single parent is enough with mandatory and optional functionalities we use abstract classes

                For example, you need many browsers to use in your application. Every browser has common mandatory functionalities like get() method.
                We put common functions into a "Browser Interface" then make "Chrome", "Safari" etc. classes as children of "Browser Interface" so get() method
                will be mandatory for the "Chrome", "Safari", etc. classes
 */
public interface C01Animal extends C00Creature {

    int eat(String foodName);

    char NAME = 'A'; //public, static, final




}
