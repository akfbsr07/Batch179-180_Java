package day14_contructors_oop;

/*
    1)We create parent class and put common methods into the parent class to,
      i)Prevent repetition
      ii)Make maintenance easy
      iii)Make update easy
      iv)Save time in code typing
      v)Make the classes as possible as simple,small to make them work faster

     2)To make a class use methods from another class, we should  create parent-child(super-sub) relationship between them.
       To create "parent-child relationship" we use "extends" keyword from "child class" to "parent class"

     3)Public and Protected methods can be inherited by child classes without any restriction
       Default methods can be inherited if the object and the parent class are in the same package
       Private methods can not be inherited by the child classes

     4)If a child class uses class members from parent class, it is called "inheritance"

     5)Object-Oriented Programming concept has 4 principles
         i)Inheritance
         ii)Encapsulation
         iii)Polymorphism
         iv)Abstraction

     6)There are different types of Inheritance
         i)Multiple Inheritance: Does not supported by Java. A child class can only have one parent class.
                                 Java supports "Single Inheritance" which is means every child class can have one parent class

         ii)Multilevel Inheritance: Java supports "Multilevel Inheritance".
                                    A class can have one parent class, one grandparent class and so-and-so forth to the top

         iii)Hierarchical Inheritance: It is the combination of "Multilevel Inheritance" and "Single Inheritance".Every child has a one parent above.
 */
public class C03Animal {

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

    public int age;

    public String name;

    //Note: If two classes have "IS-A" or "HAS-A" relationship they called "Covariant Data Types"(Every class also is a data type in Java)


















}
