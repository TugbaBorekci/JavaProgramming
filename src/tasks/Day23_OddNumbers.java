package tasks;

public class Day23_OddNumbers {

    public static void main(String[] args) {
        oddNumbers();
    }

        // create a method that can print odd numbers between 1~100 in a same line separated by space

        public static void oddNumbers () {

            for (int i = 1; i < 100; i += 2) {
                System.out.print(i +" ");
            }
        }
    }
