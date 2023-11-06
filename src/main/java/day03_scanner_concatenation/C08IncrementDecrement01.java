package day03_scanner_concatenation;

public class C08IncrementDecrement01 {

    public static void main(String[] args) {

        // Increment means to increase value of a variable
        int age = 13;

        //1.Way:
        age = age+2;
        System.out.println(age); //15

        //2.Way:
        age += 2;
        System.out.println(age); //17

        //Increment can be done by multiplication as well

        //1.Way:
        age = age*2;
        System.out.println(age); //34

        age *= 2;
        System.out.println(age); //68

        //Syntax used just to increase by 1
        age++;
        System.out.println(age); //69

        //Decrement means to decrease value of a variable

        age = age-2;
        System.out.println(age); //67

        age-=2;
        System.out.println(age); //65

        age = age/5;
        System.out.println(age); //13

        age /= 13;
        System.out.println(age); //1

        age--; //Syntax just to use decrease by 1
        System.out.println(age); //0

    }

}
