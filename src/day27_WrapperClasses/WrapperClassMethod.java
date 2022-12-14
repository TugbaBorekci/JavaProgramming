package day27_WrapperClasses;

public class WrapperClassMethod {
    public static void main(String[] args) {

        String str = "123";//String degeri Integer ve doubla cevirmek icin

        int num = Integer.parseInt(str);//int
        System.out.println(num +1);//124 int num a integer parseInt metodu ile intiger olarak atama yapildi
        System.out.println(str +1);//1231 string oldugu icin sadece yanyana yazdirdi

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); //double
        System.out.println(num2 +1);//11.5 integer olarak atama yapidi matamatiksel degerleri topladi
        System.out.println(str2 +1);//10.51 //string oldugu icin yanyana yazdiridi

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max1 = Integer.MAX_VALUE;
        long min1 = Integer.MIN_VALUE;
        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);

        String s1 = "true"; //"maybe" olsaydi string false yazdirir
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println("r1 = " + r1);

        System.out.println("-------------------------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2); //Integer
        System.out.println(x);

        String s3 = "1.5";
        Double z = Double.valueOf(s3); //Double

        System.out.println(z);

        System.out.println("-------------------------------------------------------------");

        //is digit(0)
        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);
        boolean ch2 = Character.isLetter(ch1);
        boolean ch3 = !Character.isLetterOrDigit(ch1);
        boolean ch4 =  Character.isUpperCase(ch1);
        boolean ch5 = Character.isLowerCase(ch1);

        System.out.println(r2);//true
        System.out.println(ch2);//false
        System.out.println(ch3);//false
        System.out.println(ch4);//false
        System.out.println(ch5);//false

        System.out.println("-----------------------------------------------------------");

        String s  = "ab1cd2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if (Character.isDigit(each)){
                //sum +=each;//202
                sum += Integer.parseInt(""+each);

            }

        }
        System.out.println("sum = " + sum);
    }
}
