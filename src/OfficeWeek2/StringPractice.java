package OfficeWeek2;

public class StringPractice {

    public static void main(String[] args) {

        //String data type kullandigimizda  veriyi "" icine yazmamiz lazim.yoksa string olarak algilamaz.
        String a = "home";
        String b = "b";

        String address = "xxx Street, xxdxx Avenue no: 15";

        String number = "15"; //burdaki "15" numara olarak degil string olarak iki rakam ayri ayri okunur
        int number1 = 15;//15
        System.out.println(number);
        System.out.println(number1);

        System.out.println("--------------------------------------");

        //String brand = "MSI" + "Laptop";
        //System.out.println(brand);


        String brand = "MSI";
        String category = "Laptop";
        String result = brand + category;
        String result2 = brand +" "+ category;
        System.out.println(result);//MSILaptop
        System.out.println(result2);//MSI Laptop

        System.out.println("--------------------------------------");

        int cardNo = 15;
        String cardName = "Card Name: ";
        System.out.println(cardName + cardNo);

        int num1 = 5;
        String num2 = "5";

        System.out.println(num1 + num2);//55
        System.out.println(num2 + num1);//55
        System.out.println(num1 + 5 + num2);//105===>start int 5 yazicagiz sonra string oldugu icin tek tek devam edicek
        System.out.println(num2 + 5 + num1);//555===>start string o yuzden toplama yapmiycagiz tek tek yazilicak
        System.out.println(5 + num1 + num2);//105===>numara ile baslayip int ile devam ediyor ikisini topluyoruz sonra string olani oldugu gibi yaziyoruz

        System.out.println("5" + 5 + 5);//555
        System.out.println(5 + "5" + 5);//555
        System.out.println(5 + 5 + "5");//105

        System.out.println("--------------------------------------");

        String letter = "B";
        int num = 1;
        System.out.println(letter + num);//B1

        char letter2 = 'B';
        int num3 = 1;
        System.out.println(letter2 + num3);//67 char oldugu icin ASCII table dan B nin degerini bulup oyle toplama yapiyor

        System.out.println("--------------------------------------");

        boolean question = false;


    }
}
