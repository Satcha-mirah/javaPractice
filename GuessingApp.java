package assignment;

import java.util.Scanner;
public class GuessingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int actualNumber = 69;


        int count = 1;
        while (count > 0) {
            System.out.print("enter guessed number: ");
            int guessedNumber = input.nextInt();
//           System.out.println("GuessMyNumber: ");
            if (guessedNumber < actualNumber) {
                System.out.println("too low, try again: ");
            } else if (guessedNumber > actualNumber) {
                System.out.println("too high, try again: ");
            } else {
                System.out.println("Perfect: ");
                break;
            }

        }


    }

    public static class Sum {
        public static void main(String[] args) {
            int total = 0;


            for (int number = 0; number <= 10; number += 1 ) {
                total += number;
            }
            System.out.printf("Sum is %d%n", total);
        }
    }
}



















