package tddPractice;

public class Arithmetic {


    public double squaredNumberSum(int num1, int num2) {
        double square1 = Math.pow(num1, 2);
        double square2 = Math.pow(num2, 2);
        return square1 + square2;
    }

    public int collectInputFromUser(int number, int number1) {

        if (number <= 0 || number1 <= 0) {
            System.out.println("Invalid input");
        }
        int input = number + number1;

        return input;
    }

    public int getSquaredNumber1(int num1) {
        return (int) Math.pow(num1, 2);
    }

    public int getSquaredNumber2(int num2) {
        return (int) Math.pow(num2, 2);
    }

    public double squaredNumberDifference(int num1, int num2) {
        double square1 = Math.pow(num1, 2);
        double square2 = Math.pow(num2, 2);
        return square1 - square2;
    }
}



