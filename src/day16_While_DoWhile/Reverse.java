package day16_While_DoWhile;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index number start(0)  01234567891011

        String result = "";// contain the reversed version of str
        //noopS nedooW

    /*
      // result+= str.charAt(str.length()-1 );//last character find formul //n

       //index numberi yazarakta son harfini bulabiliriz
        result+=str.charAt(11);//n
        result+=str.charAt(10);//o
        result+=str.charAt(9);//o
        result+=str.charAt(8);//p
        result+=str.charAt(7);//S
        result+=str.charAt(6);//bosluk
        result+=str.charAt(5);//n
        result+=str.charAt(4);//e
        result+=str.charAt(3);//d
        result+=str.charAt(2);//o
        result+=str.charAt(1);//o
        result+=str.charAt(0);//W

        System.out.println(result);

*/
        for (int i = str.length() - 1; i >= 0; i--) {//i: index numbers of str (starting last index to index 0)
            result+=str.charAt(i);//adding each character to result

        }
        System.out.print(result);
    }
}


            /*
            1. Write a program that can reverse a String
            ex:
            input:
            Wooden Spoon

            output:
            noopS nedooW

 */