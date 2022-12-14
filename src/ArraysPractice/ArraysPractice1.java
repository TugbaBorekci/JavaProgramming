package ArraysPractice;

public class ArraysPractice1 {
    public static void main(String[] args) {

        int[] arr1 = {2,4,6,8,10};

        //arrayin bir elementine ulasmak istersek
        System.out.println(arr1[2]); //6

        System.out.println("-------------------------------");

        //index te value degisikligi yapmak istersek yeni bir atama yapmak icin
        arr1[3]=20;
        System.out.println(arr1[3]); //20

        System.out.println("-------------------------------");

        System.out.println(arr1.length); //5

        System.out.println("-------------------------------");

        //son elementi yazdimak istersek
        System.out.println(arr1[arr1.length-1]); //10

        System.out.println("-------------------------------");

        //array in tum elementlerini yazdirmak istersek. mesela for dongusuyle yapabiliriz

        for (int i = 0; i < arr1.length; i++) {

            System.out.println(arr1[i] +" ");

        }

        //arr1[5]=35;
       // System.out.println(arr1);// degistirmek istedigi index number i bulamiyor cunku 4 tane index var.o yuzdek konsolda
                                    //ArrayIndexOutOfBoundsException seklinde  kirmizi uyari cikiyor

        System.out.println("-------------------------------");



    }
}
