package day13_string_builder_string_buffer;

public class C02AccessModifiers01 {

    /*
        1)Access Modifiers modify accessing to data

        2)There are 4 Access Modifiers: i)Public
                                        ii)Protected
                                        iii)Default (Package Private)
                                        iv)Private (Class Private)

        3)Private class members can be accessible just from the class they were created in
          If you go to another class, it can not be accessible
          But others can be accessed from other classes

        4)"Public" access modifier is accessible from entire project
          "Default" access modifier is accessible from the package itself
           When you go to another package, default class members can not be accessible

        5)Default class members can not be accessed from other packages
          But Protected class members can be accessed if we are in a child class

        Note 1: A class can not be private ==> Template must be accessible to create object

        Note 2: When we do not mention any access modifier, it is called default access modifier

        Note 3: A class can not be protected
     */

    public static void main(String[] args) {

        C03AccessModifiersClass std = new C03AccessModifiersClass();



    }

}
