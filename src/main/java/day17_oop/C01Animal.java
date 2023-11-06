package day17_oop;

/*
     1)Java does not let us create objects from the "abstract classes"
     Because "abstract classes" have "abstract methods" which are have "missing part", "method body"
     It means "abstract methods" are incomplete methods
     If a method is incomplete, it will not complete the task in the application
     This is an issue, we do not want it

     2)If an "abstract method" was overridden by any "concrete child class", child classes of that concrete child class
     may or may not override the abstract method

     3)It is mandatory to override "abstract methods" for "concrete child classes",
     if the child class is an "abstract class" it is optional to override the "abstract method"

     4)Abstract Classes can have both abstract methods and concrete methods
     Concrete Classes can have just concrete methods

     5)Abstract Methods can use public, protected and default access modifiers.But they can not use private access modifier
     because they must be overridden to completed

     6)What is "final method";
     Final Method is a method that its body can not be updated
       Can we make an abstract method final method?
     No.Because abstract method is not completed, and it is body changed constantly by overriding
       Can we override a final method?
     No.Because we change method body in overriding but final methods' body can not be changed

     7)Can we make an abstract method "static"?
       No.An abstract method can not be static.

     8)Final methods, private methods and static methods can not be abstract.They must have body, they must, can be overridden.

 */
public abstract class C01Animal {

    public abstract void eat();


}
