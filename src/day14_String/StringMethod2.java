package day14_String;



public class StringMethod2 {
    public static void main(String[] args) {

    String str = "Java is fun, I love learning Java";
    String str2 = str.replace("Java" , "Python");//"Python is fun, I love learning Python;

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

    String email = "JohnSmith@yahoo.com";
    email.replace("yahoo", "gmail");//JohnSmith@

        System.out.println("email = " + email); // gmail

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 =  sentence.replace("Python", ""); //Java Java   C# C# C++ C++
        System.out.println("sentence2 = " + sentence2);
                sentence2= sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";//s paragraph there are many dog words
        s = s.replace("Dog", "Cat");//"Cat...
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace("C#", " Java");
        //s2 = s2.replace("C# is c", "Java is c");//printte (C# is fun, Java is cool) cikiyor
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");//printte (Jeve)cikiyor
        System.out.println("s3 = " + s3);

        System.out.println("--------------------------------------------------------");

        String result = "Java Java Java";

       // result = result.replace("Java", "Python");//replace metodu kullaninca Javalarin hepsini Python olarak degistiriyor
        result = result.replaceFirst("Java", "Python");//if we use replaceFirst it change soldan saga just fist word
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");//replaceFirst metod kullandigimiz icin sadece ilk word degisiyor
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o");//Jova(ilk a yerine o yaz diyor )
        System.out.println("result3 = " + result3);

        String result4 = "Java";
        result4 = result4.replaceFirst("va", "o");//Jao(va yerine o yaz diyor)
        System.out.println("result4 = " + result4);

        String result5 = "Java";
        result5 = result5.replaceFirst("va", "vo");//Javo(va yerine vo yaz diyor)
        System.out.println("result5 = " + result5);








    }
}
