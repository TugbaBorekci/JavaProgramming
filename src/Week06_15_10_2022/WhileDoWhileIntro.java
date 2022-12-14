package Week06_15_10_2022;

public class WhileDoWhileIntro {
    public static void main(String[] args) {

        //syntex of while
        boolean flag = true;
        int i = 0;
        //print the numbers till 100
        while (flag) { // if flag is false exit the loop
            System.out.print(" "+i++);//0~99 all wrote without 100
            if ( i == 100) // exit condition
                flag = false;
        }
        do {
            // statements
        }while (flag);


    }
}
