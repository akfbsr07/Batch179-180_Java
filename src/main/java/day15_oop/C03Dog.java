package day15_oop;

//super() is for constructor calls from parent classes
//this() is for constructor calls from same class

public class C03Dog extends C02Mammal{

    public double price;

    public int weight = 8;

    public void eat(){
        super.eat();
        System.out.println("Dogs eat");
    }

    public C03Dog() {
        System.out.println(this.weight);
        System.out.println(super.weight);
        System.out.println("No parameter");
    }

    public C03Dog(double price) {

        System.out.println("Price Parameter");
    }
}
