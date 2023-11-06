package day16_oop;


/*
    Note 1: If a method has method body, it is called "concrete body"
            If a method does not have method body, it is called "abstract method"

    Note 2: To make a method abstract
            i)Remove method body
            ii)Use "abstract" keyword between access modifier and return type
            iii)Make the class abstract as well because abstract methods can be put into abstract class

    Note 3: When you create an abstract method, all the "concrete child classes" must "override the abstract method"
            But if parent class has concrete methods, it is not mandatory to override
 */

public abstract class C07Animal {

    public abstract void eat();

}
