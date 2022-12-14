package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                break;
            }

            System.out.println(i);
        }
        System.out.println("-------------------------------");

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------");
//print all even numbers 1~10(skip the odd numbers)
        for (int i = 1; i < 11; i++) {//i:1,2,3,4,5,6,7,8,9,10
            if (i%2 != 0) { //2, 4, 6, 8, 10
                continue; //skip
            }
            System.out.println(i);

        }
        System.out.println("-------------------------------");
//print all odd numbers between 1~10(skip the even numbers)
        for (int i = 1; i < 11; i++) {//i:1,2,3,4,5,6,7,8,9,10
            if (i%2 == 0) { //1, 3, 5,  7, 9
                continue;
            }
            System.out.println(i);


        }
    }
}