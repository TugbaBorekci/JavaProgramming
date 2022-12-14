package Replit;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {

   /*
     Use `String methods` and `if statements` to find what is inside of the sandwich.
     A sandwich is two pieces of bread with something between them.
     We want to see what is between our bread pieces.
     There will have only one input `str`.
     Inside of the `str` String we will look for the first occurrence of the text 'bread' and the last occurrence of the text 'bread'.
     Using those two points we will pull out the text between them.
    */

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        //first make sure we have at least 2 bread
        //string contains bread
        //then get the middle part using substring
        if (str.contains("bread")){
            int firstIndex = str.indexOf("bread");
            int lastIndex = str.lastIndexOf("bread");

            if(firstIndex==lastIndex){
                System.out.println("nothing");
            }else{
                //it means we have at least 2 bread
                //0123456789012
                //breadjambread
                System.out.println(str.substring(firstIndex + 5,lastIndex));
            }
        }else{
            System.out.println("nothing");
        }




    }
}
