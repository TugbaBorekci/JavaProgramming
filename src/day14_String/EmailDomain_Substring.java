package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        //domain:every single email to domain between @ and .because gmail,yahoo.hotmail can be change veri
        int beginningIndex = email.indexOf("@") + 1 ;
        int endingIndex = email.lastIndexOf(".");
        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println(domain);

        System.out.println("---------------------------------------");

        String str1 = "Java is fun, Java is cool";
                   //  0123456789..
                   //

       String s1 = str1.substring(0, 10+1) ;  //Java is fun

        int beg = str1.lastIndexOf("J");
        String s2 = str1.substring(beg) ; //Java is cool


        System.out.println(s1);
        System.out.println(s2);

        System.out.println("---------------------------------------");
        //ucuncu bir kelime ekleyelim I love Java
        String str2 = "Java is fun, Java is cool, I love Java";
        //  0123456789..
        //

        String p1 = str2.substring(0, 10+1) ;  //Java is fun

        int begin = str2.indexOf(" J") + 1;
        int end = str2.lastIndexOf(",");

        String p2 = str2.substring(begin, end ) ; //Java is cool

        String p3 = str2.substring(  str2.lastIndexOf("I") );//I love Java

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("---------------------------------------");

       /* String email2 = "mike_tyson@hotmail.com";
        String firstName2 = email2.substring(0, email2.indexOf("_"))  ;
        String lastName2 = email2.substring(email2.indexOf("_")+1 , email2.indexOf("@"));
        String rest = email2.substring(email2.indexOf("@"));
        email2 = lastName2 + "_" + firstName2 + rest;
        System.out.println(email2);
        */
        //tasklarda email ornekler var bak









    }


}
