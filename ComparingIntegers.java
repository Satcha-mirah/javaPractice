package assignment;

import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        int   square = number * number;
        System.out.printf("square of %d%n is %d%n", number, square);

        if (square == 100){
            System.out.printf("%d%n and it's square %d%n == 100", number, square);
        }

        if(square != 100){
            System.out.printf("%d%n and it's square %d%n != 100", number, square);
        }

        if (square < 100) {
            System.out.printf("%d%n and it's square %d%n < 100", number, square);
        }

        if (square > 100) {
            System.out.printf("%d%n and it's square %d%n < 100", number, square);
        }

    }
}
