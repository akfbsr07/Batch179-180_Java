package day15_oop;

/*
    1)To have specific implementations for child classes we use "Method Overriding"

    2)In "Method Overriding", we change the method body
      In "Method Overriding", we do not touch method name, method parameters
      Method name and Method Parameters are called Method Signature, we do not touch method signature

    3)In Method Overriding, if return type is void, do not change it
      In Method Overriding, if return type is primitive, do not change it

    4)In Method Overriding, if returns types have parent-child relationship between them, you can change the return types
      In Method Overriding, if returns types are covariant data types(HAS-A, IS-A) you can change the return types
      Return type can not be smaller than the created object.Has to be equal or wider.

  */

public class C07Animal {

    public void eat(){
        System.out.println("Animals eat...");
    }

    public int getWeight(){
        return 12;
    }

    public C07Animal create(){
        return new C07Animal();
    }



}
