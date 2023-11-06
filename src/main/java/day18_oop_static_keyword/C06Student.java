package day18_oop_static_keyword;

/*
    1)Static class members are shared by all objects
      Non-static class members are not shared by all objects, they are specific for the objects
    2)Updates on Static class members are visible by all objects automatically
      Updates on Non-static class members are not visible by other objects, to make it visible for the others, you need to type some codes
    3)To access Static class members, just class name is enough.
      But to access Non-static class members, you have to create object
    4)Static class members are created together with the class,
      Non-static class members are created when you create an object
    5)Static class members are created just once
      Non-static class members are created in every object creation
 */

public class C06Student {

    public static int numOfStd = 0;  // "class variable" and "static variable" are synonym

    public int numOfEyes = 0;  // "instance variable" and "non-static variable" and "object variable "are synonym

    public C06Student() {
        this.numOfEyes = numOfEyes + 2;
        numOfStd++;
    }
}
