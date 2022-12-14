package homeWork;

import java.util.Scanner;

public class BosSayfa {
    public static void main(String[] args) {

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("T", ""));
        System.out.println(name.length());
        System.out.println(name.charAt(8));
        System.out.println(name.replace('t','T').replace('b', 'B'));

        String name1="tugba";
        String name2="TUGBA";
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name2.equals(name1));
        System.out.println(name2.equalsIgnoreCase(name1));
        System.out.println(name1.endsWith("a"));
        System.out.println(name1.endsWith("gba"));
        System.out.println(name1.endsWith
                (""));
        System.out.println(name1.endsWith("tugba"));
        System.out.println(name1.startsWith(""));

        String text ="Can, Cananlara gitmek icin can atiyor";
        System.out.println(text.replaceAll("Can","Turk"));

             String str = "Java code yaz";
        System.out.println(str.substring(8,8));
*/




      /*  switch (days){
            case "monday":
            case "tuesday":
            case "wednasday":
            case "thursday":
            case "friday":
                System.out.println("Week days");
                break;
            default:
                System.out.println("invalid");
                break;



*

       */

        long a = 7_200L;
        double b = (float) a;
        int c = (short) b;
        System.out.println(c % 1000);

        System.out.println(16 / 3);

        System.out.println(10 / 3.0);
        System.out.println((int) 10.0 / 3);

        for (int i = 1; i < 7; i += 2) {
            System.out.println("i = " + i);

        }

        System.out.println("-----------------------------------------------");
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello");
            i++;
        }

        System.out.println("-----------------------------------------------");

        int not;
        not = 30;
        System.out.println(not);

        System.out.println("-----------------------------------------------");

        int not1 = 60;
        not1 = not1 + 60;
        System.out.println(not1);

        System.out.println("-----------------------------------------------");

        double bank = 1000;
        bank = bank + 100;
        bank = bank - 370.50;
        System.out.println(bank);

        System.out.println("-----------------------------------------------");

        float h = 20f;
        float k = 6f;
        System.out.println(h / k);//3.3333333  float ta virgulden sonra 6,7 basamak oldugu icin o kadarini yazar notmalde sonsuz devam ediyor bu sayinin bolumu


        double l = 20;
        double m = 6;
        System.out.println(l / m);//3.3333333333333335 double da da virgulden sonra 15,16 basamak oldugu icin o kadarini yazar ama burda son rakam 5 demis bazen bu hata olabiliyor normalde 3333 diye sonsuz devam ediyor


        System.out.println("-----------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim = scan.nextLine();//nextLine() o satirda yazilan tum bilgileri alir iki isimli olabilir
        // next() kullansaydik ilk bosluga kadar olan kismi alir sadecd bir kelime alir yani

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi girin");
        double yas = scan.nextDouble();

        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyisim + "\nYasiniz : " + yas + "\nKaydiniz basariyla tamamlanmistir.");

        System.out.println("-----------------------------------------------");

        //swap islemleri yani verileri degistirme
        System.out.println("Lutfen birinci tamsayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci tamsayiyi giriniz");
        int sayi2 = scan.nextInt();

        int bos;
        bos = sayi2;
        sayi2 = sayi1;
        sayi1 = bos;

        System.out.println("sayi1'in degeri = " + sayi1);
        System.out.println("sayi2'in degeri = " + sayi2);

        System.out.println("-----------------------------------------------");

        //DATA CASTING

        double s = 20;

        int sayi = 15;
        long ln = sayi; //esitligin sol tarafi long long, sag tarafi yani deger int java itiraz etmedi

        System.out.println(ln);//15 olarak atama yapiyor

        /*
        dar data turunden bir degeri genis data turundeki variable a atama yaparsaniz
        java bunu ototmatik olarak yapar
         */
        short sh = 23;
        int f = sh;
        long lng = sh;
        float fl = lng;

        /*
        ama tersini yapmak isterseniz
        yani buyuk data turundeki bir degeri kucuk data turundeki variable a atamak isterseniz
        java kabul etmez ama sorumlulugu bizim almamizi ister bazi deger kayiplari olur

        ancak bu durumda data kayiplari (double'dan int'e geceken virgulden sonrasi silinir.
        veya baskalasim olabilir(int'i byte cevirirsek 127 sayisindan buyukse tekrar basa doner
         -128 gider ve 127'ye dogru istediginiz sayiyi bulana kadar hesaplar tekrar tekrar  basa donerek

         */

        System.out.println('a' + 'b');//'a'+''b' char karakterleri oldugu icin ASCII tablosundaki degerlerine bakarak toplama yapar
        // 97 + 98 = 195 sonucunu vericek

/*
        int sayi3 = 10;
        sayi3++;
        System.out.println(sayi3);
        sayi3++;
        System.out.println(sayi3);
*/

String str = "Batch 21";
int Z = str.trim().length();
        System.out.println(Z);


    }
}










