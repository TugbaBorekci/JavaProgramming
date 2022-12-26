package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(AccessModifiers_Test4.name1);//default access modifier kendi class i disinda kullanilamiyor hata veriyor
        System.out.println(AccessModifier_Test4.name2);//protected access modifier visible outside package

        //AccessModifier_Test4.method1();//default access modifier(only inherited this class)
        AccessModifier_Test4.method2();//Always visible within the same package.
                                       //Visible outside the package in subclass

    }
}
