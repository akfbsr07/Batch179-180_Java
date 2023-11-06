package day06_string_manipulations_loops;

public class C04StringManipulations04 {

    public static void main(String[] args) {

        //Example 5 (***QUESTION***): String shirtPrice = "$12.99";
        //           String bookPrice = "$35.99";
        //           Type the code to find the sum of prices

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        // 1.Step: Remove currency symbols or chars different from digits and dot

        String newShirtPrice = shirtPrice.replaceAll("[^0-9.]", "");
        System.out.println(newShirtPrice);
        String newBookPrice = bookPrice.replaceAll("[^0-9.]", "");
        System.out.println(newBookPrice);

        // 2.Step: Change String data type to numeric data type

        double doubleShirtPrice = Double.valueOf(newShirtPrice);

        double doubleBookPrice = Double.valueOf(newBookPrice);

        System.out.println("Total price is $" + (doubleShirtPrice + doubleBookPrice));

    }

}
