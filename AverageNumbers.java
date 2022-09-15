package assignment;

import java.util.Scanner;
public class AverageNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.println("Enter third integer: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("sum of %d%n and %d%n and %d%n is %d%n", number1, number2, number3, sum);

        int product = number1 * number2 * number3 ;
        System.out.printf("product of %d%n and %d%n and %d%n is %d%n", number1, number2, number3, product);

        int average = sum / 3;
        System.out.printf("average of %d%n and %d%n and %d%n is %d%n", number1, number2, number3, average);

         int largestNumber = number1;
         if(number2 > number1){
             largestNumber = number2;
             System.out.printf("the largest number: %d", number2 );
         }
         if(number3 > number1){
             largestNumber = number3;
             System.out.printf("the largest number: %d",  number3);
         }

         int smallestNumber = number2;
         if(number1 < number2) {
             smallestNumber = number1;
             System.out.printf("the smallest number:%d", number1);
         }

         if (number3 < number2){
             smallestNumber = number3;
             System.out.printf("the smallest number: %d", number3);
         }





    }
}
