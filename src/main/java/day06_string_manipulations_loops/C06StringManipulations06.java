package day06_string_manipulations_loops;

public class C06StringManipulations06 {

    public static void main(String[] args) {

        String s = "Java is Java";

        //Other Methods

        boolean r1 = s.contains("v");
        System.out.println(r1); //true

        boolean r2 = s.contains("x");
        System.out.println(r2); //false

        boolean r3 = s.startsWith("J");
        System.out.println(r3); //true

        boolean r4 = s.startsWith("j");
        System.out.println(r4); //false

        boolean r5 = s.endsWith("a");
        System.out.println(r5);

        boolean r6 = s.endsWith("V");
        System.out.println(r6);

        char r7 = s.charAt(2); // If you want to get a "single character" in "char data type" use charAt()
        System.out.println(r7); //v

        String r8 = s.repeat(3);
        System.out.println(r8);





    }

}
