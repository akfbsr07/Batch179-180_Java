package day11_array_lists_method_creation_method_overloading_varargs_pass_by_value;

public class C05PassByValuePassByReference {

    //PassByValue protects the original value of the variable

    public static void main(String[] args) {

        int n = 5;
        int m = 7;

        int sum = add(n, m); //Java does not use the original n and m variables in the method.
                             //It is just pass the value of variables by create copy of them.
                             //So if the method changes the variables it is not changing the original ones but the copies.

                             //Pass By Reference changes the original value so does not supported by Java.
    }

    public static int add(int... a){

        int sum = 0;

        for (int w: a){
            sum = sum + w;
        }
        return sum;
    }
















}
