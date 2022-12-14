package week10_11_12_2022;

public class Task1RemoveCharacterFindWord {
    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        getSentence(str);
    }

    public static void getSentence(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))//bu bir yol
                temp+=' ';


            if (Character.isAlphabetic(ch) || ch == ' ') {//bu da farkli bir yol
                temp += ch;
            }
        }
        System.out.println(temp.trim());
    }

}

/*
Task 1 : Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java
 */
