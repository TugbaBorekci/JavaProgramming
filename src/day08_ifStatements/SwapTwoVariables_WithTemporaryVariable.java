package day08_ifStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
// ------------------------------------------
     int c = b; //c=15

     b = a; //b=10
     a = c; //a=15



        //------------------------------------
        System.out.println("a= " + a); //15
        System.out.println("b = " + b); //10





    }
}
