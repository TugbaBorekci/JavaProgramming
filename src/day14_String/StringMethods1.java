package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "    batch 25     ";
        str1.trim(); //"batch 25"iki kelime arasinda nekadar bosluk birakirsa onu gosteriyor ama oncesindeki ve sonrsindaki bosluklari da goasteryor printte
        System.out.println(str1);
        System.out.println(str1.trim());

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");//8
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");//9
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("a ");//indexOf metotla yaptigimiz icin a nin yaninda bosluk birakmazsak ilk kelimedeki ilk a yi algiliyor fakat bosluk birakirsak sondaki a yi algiliyor
                                    // indexOf metotla yaptigimiz icin a nin yanina n "an"yazarsak son kelimedeki yaninda n olan a yi algiliyor.
                                    // indexOf metotla yaptigimiz icin a nin yanina mm "amm"yazarsak ikinci kelimedeki yaninda mm olan a yi algiliyor
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g");//indexOf metotla yaptigimiz icin ilk g yi algiliyor ikinci kelimede var-8 yazdirir
                                    //indexOf metotla yaptigimiz icin g nin yanina u"gua"yazarsak ucuncu kelimedeki yaninda ua harfi olan g yi algiliyor-20 yazdirir
                                    //indexOf metotla yaptigimiz icin g nin yanina e"ge"yazarsak ucuncu kelimedeki yaninda e harfi olan g yi algiliyor-23 yazdirir
                                    //indexOf metotla yaptigimiz icin ilk g nin yanina bosluk "g " g nin yaninda bosluk olan g yi algiliyor ikinci kelimenin sonunda var - 15 yazdirir
        System.out.println("n4 = " + n4);

        //int n5 =  str3.lastIndexOf( str:"g");//burada lastIndexOf methodunu kullandigimiz icin soldan saga bakicak soldan ilk g harfini yazicak
        //System.out.println("n5 = " + n5);


        System.out.println("--------------------------------------------");
                //  01234567890123456789012345
        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");//first a yi istedigi icin indexOf metodu kullandik soldan saga ilk a ya bakicak
        int lastA = s.lastIndexOf("a"); // last a yi istegigi icin lastIndexOf metodunu kullandik soldan saga son a ya bakicak
        int secondA = s.indexOf("a ");//second a yi istedigi icin indexOf metodu kullandik soldan saga ikinci a ve yaninda bosluk olana bakiyor
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava W");
       // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") +1;
        //int fifthA = s.lastIndexOf("va") +1;
        int fifthA = s.lastIndexOf("a W") ;
        int sixthA = s.lastIndexOf("aw") ;
        //int seventhA = s.lastIndexOf ("a o") ;
        int seventhA = s.lastIndexOf("a ") ;


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);









    }




}
