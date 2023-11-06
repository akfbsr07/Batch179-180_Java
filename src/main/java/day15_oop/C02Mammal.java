package day15_oop;

//super() is for constructor calls from parent classes
//this() is for constructor calls from same class
public class C02Mammal extends C01Animal{

    public String type;
    public int height;

    public int weight = 10;

    public void eat(){
        super.eat();
        System.out.println("Mammals eat");
    }

    public C02Mammal(){
        System.out.println(super.weight);
        System.out.println("No parameter");
    }

    public C02Mammal(String type, int height){

        System.out.println("Type and Height parameters");
    }


}
