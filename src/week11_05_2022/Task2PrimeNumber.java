package week11_05_2022;

public class Task2PrimeNumber {
    public static void main(String[] args) {

    /*
    Task 2 :   Write a method that can check if a number is prime or not

                Note : Prime numbers are special numbers, greater than 1,
                that have exactly two factors, themselves and 1
      ex:7 is divisible by 2 or not
                        by 3 or not
                        by 4 or not
                        by 5 or not

     */

        boolean result = isPrime(10);
        System.out.println(result);

    }

    public static boolean isPrime(int number) {
        boolean isPrimeNumber = true;

        if (number < 2){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {// kalansiz bolunuyorsa prime number kalanli bolunuyorsa not prime
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }



}


