package TugbaWork.IfStatements;

import java.util.Scanner;

public class IfStatements_1 {
    public static void main(String[] args) {
        //soru1- Kulllanicidan bir sayi isteyin
        //sayiyi kontrol edip 5 ile bolunebiliyorsa "sayi 5 in tam kati "yazdirin

        Scanner scan =  new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi%5 == 0);
        System.out.println("Girilen sayi 5'in tam kati");

    }
}