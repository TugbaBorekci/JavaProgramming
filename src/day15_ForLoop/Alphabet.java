package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        //A~Z ===>if int kullanicaksak 65~90

        for (int i = 65; i <= 90; i++){
            System.out.print((char) i+" ");//buraya char yazmamiz gerekiyor karakter istedigi icin char yazmazsak numara olarak yaziyor
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (char i = 'a'; i <= 'z'; i++) {//i:a, b, c, d, ....z
            System.out.print(i + " ");//tekrar char yazmiyoruz cunku yukarda char olarak verilmis
        }
        System.out.println();
        System.out.println("-------------------------------------");

        for (char i = 'Z'; i >= 'A'; i--) {//  i den sonra -- kullandik cunku geriye dogru sayilicak i:Z, Y, X,W ....A
            System.out.print(i + " ");//tekrar char yazmiyoruz cunku yukarda char olarak verilmis
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (char i = 'z'; i >= 'a'; i--) {//i:z, y. x, w....a
            System.out.print(i + " ");//tekrar char yazmiyoruz cunku yukarda char olarak verilmis
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (char i = 1; i <= 40000; i++) {
            System.out.print(i + " ");
        }

    }

}
