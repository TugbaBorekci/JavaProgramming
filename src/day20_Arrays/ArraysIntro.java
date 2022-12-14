package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

            //we didn't give specific object index
        //String myGroup[]; //[]bracket i variable dan sonra da (myGroup[]) koyabiliriz data type tan sonra da (String[])koyabiliriz
       //String[] myGroup = new String [5];

       //System.out.println(myGroup); //hashcode
        //System.out.println(Arrays.toString(myGroup));//[null, null, null, null, null] gecersiz value

        //int[] myGroup = new  int[5];
        //System.out.println(Arrays.toString(myGroup));//[0, 0, 0, 0, 0]

        //byte[] myGroup = new  byte[5];
        //System.out.println(Arrays.toString(myGroup));//[0, 0, 0, 0, 0]

        //short[] myGroup = new  short[5];
        //System.out.println(Arrays.toString(myGroup));//[0, 0, 0, 0, 0]

        //long[] myGroup = new  long[5];
        //System.out.println(Arrays.toString(myGroup));//[0, 0, 0, 0, 0]

        //float[] myGroup = new  float[5];
        //System.out.println(Arrays.toString(myGroup));//[0.0, 0.0, 0.0, 0.0, 0.0]

        //double[] myGroup = new  double[5];
        //System.out.println(Arrays.toString(myGroup));//[0.0, 0.0, 0.0, 0.0, 0.0]

        //boolean[] myGroup = new  boolean[5];
        //System.out.println(Arrays.toString(myGroup));//[false, false, false, false, false]


        //create a variable that's capable enough to contain 5 specific object index{"Gunay", "Neira", "Suat", "Hulya", "Mikael"]

/*
        String[] myGroup = new  String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));//Gunay, Neira, Suat, Hulya, Mikael
        //Gunay, Neira, Suat, Mikael, null burda once 3 e hulyayi atama yapiyor ama sonra tekrar 3 e mikael atama yaptigi icin hulyayi yazmiyor
        onun yerine mikael yaziyor bir sonrakini de daha once 5 index istedigimizi yazdigimi icin null yaziyor
*/
/*
        String[] myGroup = new  String[5];
        // 0~4 sadece bu index leri yazar eger "Muhtar" i da eklemek istiyorsak hata verir hicbirsey yazdirmaz
        // once [5] icindeki index number i degistirmemis gerekiyor[6]yapmamiz lazim
        // yada kac tane artiricaksak ona gore index number vermemeiz lazim
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        myGroup[5] = "Muhtar";

        System.out.println(Arrays.toString(myGroup));//Gunay, Neira, Suat, Hulya, Mikael,

*/

        /*

       String[] myGroup = new  String[6];
        // 0~5 arasi yazdiricak simdi index number i degistirdigimiz icin
        // once [5] icindeki index number i degistirmemis gerekiyor[6]yaptik
        // yada kac tane artiricaksak ona gore index number vermemeiz lazim biz bir artirdik simdi
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        myGroup[5] = "Muhtar";

        System.out.println(Arrays.toString(myGroup));//Gunay, Neira, Suat, Hulya, Mikael, Muhtar
      */


    }
}
