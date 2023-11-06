package day15_oop;

// You can create myDog object by using the data type of any parent class.
// Whichever parent class data type you create the object,
// if all the parent classes have a variable with same name and data type
// the value of the selected data type's class will print on the console when you call the variable.

import day14_contructors_oop.C04Dog;

public class C06AnimalRunner {

    public static void main(String[] args) {

        C03Dog myDog = new C03Dog();           //
        System.out.println(myDog.weight);      //  8
        // C02Mammal myDog = new C03Dog();     //
        // System.out.println(myDog.weight);   //  10
        // C01Animal myDog = new C03Dog();     //
        // System.out.println(myDog.weight);   //  12

        myDog.eat();



    }

}
