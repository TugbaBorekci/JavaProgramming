package tasks;

public class Day10_GradeNestedIf {
    public static void main(String[] args) {


        char grade = 'D';
        String result = "";

        boolean validVariable = (grade >= 'A' && grade <= 'D') || grade == 'F';

        if (grade == 'A'){
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        }else if (grade == 'F') {
            result = "Failed";
        }else {
            result = "Invalid Grade";
        }
            System.out.println(result);
    }
}
/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */