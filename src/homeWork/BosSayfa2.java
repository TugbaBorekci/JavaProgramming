package homeWork;



public class BosSayfa2 {

    public static void main(String[] args) {
      try {
            System.out.println(9/0);
          System.out.println("try block");
       }catch (ArithmeticException e){
          System.out.println("Catch block");
          // e.printStackTrace();
       }
        System.out.println("Hello");
    }


}

