package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }

        System.out.println("------------------------------------------------");

        //nested loop(loop inside another loop) icinde baska bir loop olmasi iki loop u kullanarak 20 tane yazmasini istedik 4*5=20 tane wooden spoon yazdi
        //one iteration of the outer loop, executes all the iteration of the inner loop
        for (int j = 0; j < 4; j++) { //j: 0, 1, 2, 3
            for (int i = 0; i < 5; i++) { //i: 0, 1, 2, 3, 4
                System.out.println("Wooden Spoon");

            }

        }

    }
}