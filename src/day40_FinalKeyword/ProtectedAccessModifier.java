package day40_FinalKeyword;

public class ProtectedAccessModifier {

    static String name1 = "Cydeo";//default access modifier.(only inherited this class)
    protected  static String  name2 = "WoodenSpoon";//protected access modifier(inherited if it could be visible if the class is Subclass.if that class not Subclass outside package it is not visible outside  this variable

    static void method1(){//default access modifier(only inherited this class)

    }

    protected static void method2(){//Always visible within the same package.
                                    //Visible outside the package in subclass

    }
}
