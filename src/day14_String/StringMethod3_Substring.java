package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring method===> substring(beginning index, ending index)

        String word = "Cydeo School";
                   //  0123456789...

       // String brand = word.substring(0, 4); //Cyde(0, 4) yazdigimizda sadece Cyde yaziyor
        String brand = word.substring (0,  4+1); //(0, 4+1) +yaptigimizda bir sonraki harfide yaz diyor(Cydeo)

        System.out.println(brand);
        //String brand
        String str1 = word.substring(6);

        System.out.println(str1);

        System.out.println("-------------------------------------------------");

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" ")); //"Java
        String s2 = word2.substring( word2.indexOf(" ")+1,  word2.lastIndexOf(" ")); //"Programming"
        String s3 = word2.substring( word2.lastIndexOf(" ")+1 ); //"Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-------------------------------------------------");

        String word3 = "Python C# Ruby";
        String p1 = word3.substring(0, word3.indexOf(" ")); //"Python"
        String p2 = word3.substring( word3.indexOf(" ")+1,  word3.lastIndexOf(" ")); //"C#"
        String p3 = word3.substring( word3.lastIndexOf(" ")+1 ); //"Ruby"

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
