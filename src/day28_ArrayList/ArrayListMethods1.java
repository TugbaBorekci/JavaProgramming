package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();//empty Array list object created first(burda konsolda[] bos yazdiriyor)
        numbers.add(10);//0. index:burda 10 sayisini ekleme yapiyoruz bos olan Array List e(burda konsolda[10] yazdiriyor
        numbers.add(20);//1. indekburda 20 sayisini da ekleme yapiyoruz bos olan Array List e(burda konsolda[10, 20] yazdiriyor
        numbers.add(30);//2. indekburda 30 sayisini da ekleme yapiyoruz bos olan Array List e(burda konsolda[10, 20, 30] yazdiriyor
        numbers.add(40);//3. indekburda 40 sayisini da ekleme yapiyoruz bos olan Array List e(burda konsolda[10, 20, 30, 40] yazdiriyor
        numbers.add(50);//4. indekburda 40 sayisini da ekleme yapiyoruz bos olan Array List e(burda konsolda[10, 20, 30, 40, 50] yazdiriyor
        numbers.add(60);//5. indekburda 40 sayisini da ekleme yapiyoruz bos olan Array List e(burda konsolda[10, 20, 30, 40, 50, 60] yazdiriyor

//overload method ile element ekliyoruz istedigimiz index in yerine sonrasindada index sayisi degisiyor
        numbers.add(2,25);//overloaded metot ile ekleme yapiyor 2.index teki sayiyi ekleme yaparak 25 sayisini koyuyor.
                                      // toplamda element sayisi da degisiyor 6 oluyor[10, 20, 25, 30, 40, 50, 60] oluyorartik 2.index 25
                                      //eger index number sayisi buyuk olursa mesela 7 IndexOutOfException uyarisi veriyor konsolda
        numbers.add(5,45);//burda da son haliyle devam ediyor 5. index i buluyor 50 onun yerine 45 i ekleyip devam ediyor yazdirmaya
                                        //[10, 20, 25, 30, 40, 45, 50, 60] yazdiriyor
        System.out.println(numbers);

        System.out.println(numbers.size());//size metot(total of element) ile kac tane element oldugunu yaziyor saymaya 1 den basliyor konsolda 8 yazdirdi burda

        int lastIndex = numbers.size()-1; // last index size dan -1 oluyor cunku index 0 dan basliyor saymaya

        System.out.println("lastIndex = " + lastIndex);// index 0 dan basladigi icin saymaya 7 yazdiriyor konsolda

        Integer num = numbers.get(3);// get method(3) ile 3.index teki number i yazdir diyor
        System.out.println("num = " + num);// num = 30 yazdirir

        System.out.println("-------------------------------------------------------------------------");

//for loop ile  bu Arraylistteki every single elementi
        for (int i = 0; i < numbers.size(); i++) { // baslangic 0; condition size Array list last index icin(i<=numbers.size()-1)yazabilirsin
            System.out.println(numbers.get(i));//method get ile tum elementlerin listini yapti

        }

        System.out.println("--------------------------------------------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);//5 elementli array list olusturdu [Java, Python, Java, C#, Ruby]
//eger set() metodunu eklersek replaces yapiyor yani eski indeksin yerine yazdiriyor
        list.set(2,"JavaScript");
        System.out.println(list);//Java yi cikarip JavaScript yazdirdi [Java, Python, JavaScript, C#, Ruby]
        list.set(3,"C++");//C# yerine  set methodu yaparak C++ yazdiridi [Java, Python, JavaScript, C++, Ruby]
        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);//[Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan] 7 element

        //remove yapmak icin elementi
        employees.remove(0);//remove 0 numarali indexi
        System.out.println(employees);//0. indexi remove yapti [Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//0. indexi remove yapti [Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//0. indexi remove yapti [Neira, Ali, Hulya, Kaloyan]

        employees.remove(1);
        System.out.println(employees);//1. indexi remove yapti [Neira, Hulya, Kaloyan]

        employees.remove(employees.size()-1);//son index i remove yapmak icin
        System.out.println(employees);//[Neira, Hulya]

        //remove object remove(oject)i metodu boolean veriable a return yapiliyor secerek direkt cikarmak istedigimiz objekti yaziyoruz
       boolean r1 = employees.remove("Hulya"); //remove yapilicak object Array List te varsa tru yazdiriyor yoksa false yazdiricak
        System.out.println(employees);

      boolean r2 = employees.remove("Neira");//remove yapilicak object Array List te varsa tru yazdiriyor yoksa false yazdiricak
        System.out.println(employees);//[] Neire son object oldugu icin onuda remove yapinca hic element kalmadigi icin bos yazdiriyor


        System.out.println("r1 = " + r1);//remove yapilicak object Array list te oldugu icin true yazdirdi
        System.out.println("r2 = " + r2);//remove yapilicak object Array list te oldugu icin true yazdirdi
    }
}
