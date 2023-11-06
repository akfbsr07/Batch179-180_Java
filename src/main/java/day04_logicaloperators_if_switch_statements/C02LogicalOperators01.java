package day04_logicaloperators_if_switch_statements;

public class C02LogicalOperators01 {

    public static void main(String[] args) {

        //"AND" Logical Operator: &&
        //Note 1: Just a single false is enough to make the result false in "AND" operator
        //Note 2: To get true from "AND" operation, all must be true

        int i = 10;
        int k = 5;

        System.out.println((i > k) && (i == 2 * k) && (i / k == 2) && (i % k == 2)); // false

        // In the following example first statement is false so no need to check others
        // Because just a single false makes the result false in && operator
        System.out.println((i < k) && (i == 2 * k) && (i / k == 2) && (i % k == 2)); //false

        //Note: If you use &&, Java does not check the others after finding first false
        //      But if you use &, Java will check all statements
        System.out.println((i < k) & (i == 2 * k) & (i / k == 2) & (i % k == 2)); //false

        //"OR" Logical Operator: ||
        //Note 1: Just a single true is enough to make the result true in "OR" operator
        //Note 2: To get false from "OR" operation, all must be false

        int a = 6;
        int b = 2;

        System.out.println((a>=b) || (a%b!=0) || (a<=3*b)); // true

        System.out.println((a==b) || (a%b!=0) || (a>3*b)); // false

        //Note: There is no single usage of "|", in OR operation we must use "||" every time

        System.out.println(((a>=b) || (a%b!=0)) && (a<=3*b)); // true

        System.out.println((a>=b) || ((a%b!=0) && (a<=3*b))); // true





    }

}
