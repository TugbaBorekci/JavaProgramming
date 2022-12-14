package day16_While_DoWhile;

public class Palindrome {

    public static void main(String[] args) {
        String word = "level";//istedigin veriyi girip ilk reverse yapip palindrome olup olmadigini kontrol edebilirsin

        String reversed = "";//first step reversed then for loop
        for (int i =word.length()-1; i >= 0 ; i--) {//formul palindrome olup olmadiginin kontrolu icin
            reversed+=word.charAt(i);

        }
        boolean isPalindrome = word.equalsIgnoreCase(reversed);//equalIgnoreCase olmasi gerekiyor  reverse u ayni kelime olucak ama harflerin buyuk kucuk olmasi onemli degil

        System.out.println("isPalindrome = " + isPalindrome);// boolean kullanildi palindrome ise (true) yada degilse(false)yazdiricak




    }
}
/*
"Java" ===> "avaJ" ===> false (not palindrome)
"Anna" ===> "annA" ===> true (palindrome)
"Racecar ===> "racecaR ===>  (palindrome)
"Dad" ===> "daD" ===>(palindrome)
"Mom" ===> "moM" ===>(palindrome)

 */