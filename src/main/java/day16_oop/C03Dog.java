package day16_oop;

public class C03Dog extends C02Mammal {

    @Override
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Dogs feed their babies with milk...");
    }
}
