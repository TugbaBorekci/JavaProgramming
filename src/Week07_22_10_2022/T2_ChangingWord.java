package Week07_22_10_2022;

public class T2_ChangingWord {
    public static void main(String[] args) {
        /*
        -- Task 2:  Write a program that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
         */

        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String searched = "cat";
        String changed = "dog";
        String result="";

      /*
      we can easily do this. it is easy way but interwiew you show the different way
        String result1=message.replace(searched,changed);
        System.out.println("result1 = " +result1);
*/


        int indexOfFirstCat=message.indexOf(searched);
        int endOfWord = indexOfFirstCat+searched.length();

       message=message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);
        System.out.println("message = " + message);

        //we need to check the message contains cat or not
        while (message.contains(searched)){
            indexOfFirstCat=message.indexOf(searched);
            endOfWord = indexOfFirstCat+searched.length();
            message=message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);

        }

        }

        //if we have it I will change cat to dog






    }
