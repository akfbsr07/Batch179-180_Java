package day17_oop;

/*
    1)Interfaces have abstract methods.Abstract methods are uncompleted methods
    That is why Java does not let us create an object from interfaces like abstract classes

    2)"Abstract Class" is a class that is why its have a constructor.But its constructor can not create an object.
      "Interface" is not a class, it is a different structure so interfaces do not have constructors

    3)All methods in an interface must be overridden by concrete child classes.That is why interfaces are called as "to do list" as well.
 */

public interface Engine {

    public abstract void start(); //All methods in an Interface must be "public" and "abstract" as default.
                                  //So we do not have to declare them as writing in method creation.
    public abstract void stop();

    // Static Concrete Methods
    static void accelerate(){ //If you use "static" keyword, you can use concrete methods in interfaces
        System.out.println("Increase the speed so fast");
    }

    // Default Concrete Methods
    default void price(){
        System.out.println("Every engine has a price"); //If you use "default" keyword, you can use concrete methods in interfaces
    }

    //Variables in an Interface
    //1)Variables  in an interface are final, final variables must be initialized(have to have a value)
    //2)The Value of Final Variables can not be updated after initializing
    //3)"Final Variables" names must type in upper cases.
    //4)In an interface all variables are public, static and final as default so, you do not have to write them in declaration
    public static final String ENGINE_NAME = "Electrical Engine";






}
