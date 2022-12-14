package homeWork;

public class Main {
    public static void main(String[] args) {
        boolean result = false;
        int a = 10;
        //false it will look at this statements and increment the value
        if (result&a++<12){
        }

        System.out.println(a); //11

        int b =10;
        //false it will look at this statements and increment the value
        if (result && b++<12){
        }
        System.out.println("b="+b);
    }
}







