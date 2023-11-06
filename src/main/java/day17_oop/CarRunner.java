package day17_oop;

public class CarRunner {

    public static void main(String[] args) {

        Honda myHonda = new Honda();

        myHonda.price(); //price() method is a concrete method in interface, and it was created by using "default"(package private) keyword
                         //Those kind of methods are called "default methods"
                         //"default methods" are accessible by using object

        Engine.accelerate(); //accelerate() method is a concrete method in interface, and it was created by using "static" keyword
                             //Those kind of methods are called "static methods"
                             //"static methods" are accessible by using interface name, no need for an object

        System.out.println(Engine.ENGINE_NAME);

    }

}
