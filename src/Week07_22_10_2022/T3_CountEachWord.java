package Week07_22_10_2022;

public class T3_CountEachWord {
    public static void main(String[] args) {

        /*
--  Task 3: Count each name in sentence.

    input :

  String names = "Adam Adam Barry Aysun Aysun";

    output:

    Adam-2 Barry-1 Aysun-2

         */
/*
       //1.yol
        String names = "Adam Adam Barry Aysun Aysun";
        String search ="Adam";

        int counter = 0;
        while (names.contains (search)){
            counter++;
            names=names.replaceFirst(search,"");

        }
        System.out.println("counter = " + counter);

*/

        String names = "Adam Adam Barry Aysun Aysun";
        String temp = "";
        String result = "";
        for (int i = 0; i < names.length(); i++) {
            char ch = names.charAt(i);
            //we need to find word one by one
            if (ch != ' ') {
                temp += ch;
                continue;//we need to find word in order to continue to next statement
            }

            String search = temp;//temp is space

            int counter = 0;

            String dumy = names;

            while (dumy.contains(search)) {
                counter++;
                dumy = names.replaceFirst(search, "");

            }
            if (!result.contains(search)) {

                result += search + "-" + counter + " ";
                temp = "";
            }
            System.out.println("result = " + result);

        }
    }
}