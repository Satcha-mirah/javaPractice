package satchaAmirah.chapterOne;

import java.util.Scanner;

public class Velocity {
       public static void main(String[] args){
               Scanner input = new Scanner(System.in);

               System.out.print("Enter the starting velocity in meters or seconds: ");
               double startingVelocity = input.nextDouble();

               System.out.println("Enter the ending velocity in meters or seconds: ");
               double endingVelocity = input.nextDouble();

               System.out.println("Enter the time span in seconds: ");
               double timeSpan = input.nextDouble();
               
		double a = (endingVelocity - startingVelocity)/ timeSpan;	

               System.out.printf("The average Acceleration is %f%n", a);

            }
 }
