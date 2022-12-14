package day13_String;


public class StringIntro {
    public static void main(String[] args) {


        String name = "Wooden Spoon";
        String name2= "Wooden Spoon";
        String name3= "Wooden Spoon";
        String name4= "Wooden Spoon";

        System.out.println(name == name2);//true compare those object
        System.out.println(name2 == name3);//true
        System.out.println(name3 == name4);//true

        System.out.println("--------------------------------------------");

        String str1 = new String("Wodden Spoon");
        String str2 = new String("Wodden Spoon");
        String str3 = new String("Wodden Spoon");
        String str4 = new String("Wodden Spoon");

        System.out.println(str1 == str2);//false
        System.out.println(str2 == str3);//false
        System.out.println(str3 == str4);//false

        System.out.println("--------------------------------------------");




    }
}
