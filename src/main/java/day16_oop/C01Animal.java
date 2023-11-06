package day16_oop;

/*
    1)The method in child class, the Overriding Method,
    can not have narrower access modifier than the method in parent class, the Overridden Method

    Overridden Method ==> default
    Overriding Method ==> default, protected, public

    Overridden Method ==> protected
    Overriding Method ==> protected, public

    Overridden Method ==> private
    Overriding Method ==> private methods can not be overridden, it will give error

    2)Polymorphism = (Static Polymorphism)Method Overloading(same name method, different parameters) + (Dynamic Polymorphism)Method Overriding(same name method, different method body)

    3)What is the difference between "Method Overloading" and "Method Overriding"? (COMMON INTERVIEW QUESTION)
      i)"Method Overloading" occurs in a single class
        "Method Overriding" needs multiple classes

      ii)"Method Overriding" needs "inheritance", but "Method Overloading" does not need inheritance

      iii)"Private" methods can be overloaded, but private methods can not be overridden

      iv)"Method Overloading" we change "method signature"(we change parameters), but in "Method Overriding" we do not change method signature

       v)In "Method" Overloading "access modifier" and "return type" do not take any role
         but in "Method Overriding" there are some rules to change access modifier and return type

       vi)In "Method Overloading" we change the parameters and make method work with different scenarios
          but in "Method Overriding" we make the method implementation more specific for the child class

       vii)"Static methods" can be overloaded, but can not be overridden
 */

public class C01Animal {

    public void eat(){
        System.out.println("Animals eat...");
    }

}
