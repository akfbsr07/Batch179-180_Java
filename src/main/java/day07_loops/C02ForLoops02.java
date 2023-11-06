package day07_loops;

public class C02ForLoops02 {

    public static void main(String[] args) {

        //Example 4: Type code to reverse a String (VERY COMMON INTERVİEW QUESTION)
        //           Alexa ==> axelA

        String s1 = "Alex de Souza is a Brazilian football player.";
        String reversedS1 = "";

        for (int i=s1.length()-1 ; i>=0 ; i--){
            reversedS1 = reversedS1 + s1.charAt(i);
        }
        System.out.println(reversedS1);

        System.out.println();

        //Example 5: Type code to find the sum of the digits in an integer
        //           -95807323 ==> 37

        int num = -95807323;

        num = Math.abs(num); //Math.abs() method gives us the absolute value of a number

        int sumOfDigits = 0;

        for (int i = num ; i>0 ; i/=10 ){
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);

        System.out.println();


        //Example 6: Type code to find unique characters in a String
        //           Hello ==> Heo

        String s2 = "Hello";

        String unique = "";

        for (int i=0 ; i<s2.length() ; i++){
            char ch = s2.charAt(i);
            if (s2.indexOf(ch)!=s2.lastIndexOf(ch)){
                continue;
            } unique = unique + s2.charAt(i);
        }
        System.out.print(unique);




    }

}
