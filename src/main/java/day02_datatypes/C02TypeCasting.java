package day02_datatypes;

public class C02TypeCasting {

    public static void main(String[] args) {

        //Type Casting: If you assign a value of a primitive data type to another primitive data type
        //it is called type casting.

        //When you do type casting, if you put small data type into large data type
        //it is easy and called "Auto-Widening".It is done by Java automatically

        byte myAge = 34;

        int age = myAge;

        //When you do type casting, if you put large data type into small data type
        //it is risky and called "Explicit Narrowing".It is not done by Java automatically.

        long value1 = 34000000000L;

        short value2 = (short)value1;

        //Note: If all values are int in a mathematical operation, the result will be int as well.
        //If the result is decimal in maths, Java will remove decimal part automatically

        int numOfStd = 12;
        int amountOfMoney = 500;

        System.out.println(amountOfMoney / numOfStd);

        //Note2: If you use different data types in a mathematical operation
        // the result will be in the largest data type

        int numOfStudents = 12;
        float moneyAmount = 500F;

        System.out.println(moneyAmount/numOfStudents);

    }

}
