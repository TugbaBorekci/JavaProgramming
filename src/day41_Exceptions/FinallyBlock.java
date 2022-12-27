package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr ={1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
           e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }
        /*
Catch Block
Finally Block yazdiriyor ilk catch block exception type  }catch (RuntimeException e){ olunca
ayni zamanda ArrayIndexOutOfBoundsException Index 10 out of bounds for length 3
	at day41_Exceptions.FinallyBlock.main(FinallyBlock.java:10) uyarisi veriyor
	//---->ilk catch blogun Exception type degistirisek ArithmeticException yapalim
	sadece Finally Block yazdiriyor
	ve ayni zamanda ArrayIndexOutOfBoundsException Index 10 out of bounds for length 3
	at day41_Exceptions.FinallyBlock.main(FinallyBlock.java:10) uyarisi veriyor
         */
/*
eger catch bloklardan birinde cikmak istersek  }finally {
            System.out.println("Finally Block"); yadirmak istemezsek
            System.exit(0); metot yazmaliyiz System.out.println("Catch Block"); altina
 */



    }

}
