package assignment;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amirah = input.nextInt();
        int factorial = 1;
        for (int counter = 1; counter <= amirah; counter ++) {
            factorial = counter * factorial;
        }

            System.out.printf("Factorial is %d%n", factorial);
        }
    }
