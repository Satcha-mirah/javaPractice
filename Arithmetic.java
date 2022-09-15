package assignment;

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        int square1 = number1 * number1;

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        int square2 = number2 * number2;

        System.out.printf("square of %d%n and %d%n is %d%n and %d%n respectively: ", number1, number2, square1, square2);

        int sum = square1 + square2;
        System.out.printf("sum of %d and %d is %d", square1, square2, sum );

        int difference = square1 - square2;
        System.out.printf("difference of %d and %d is %d", square1, square2,difference);




    }
}
