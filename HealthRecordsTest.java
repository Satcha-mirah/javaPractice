package assignment;

import java.util.Scanner;
public class HealthRecordsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        HealthRecords healthRecords = new HealthRecords("Amirah", "Yusuf", "June", 16,
                2000,  5,  20 , "female");

        System.out.printf("Enter firstName:  ");
        String firstName = input.nextLine();
        healthRecords.setFirstName(firstName);

        System.out.printf("Enter lastName:  ");
        String lastName = input.nextLine();
        healthRecords.setLastName(lastName);

        System.out.printf("Enter gender:  ");
        String gender = input.nextLine();
        healthRecords.setGender(gender);

        System.out.printf("Enter month:  ");
        String month = input.nextLine();
        healthRecords.setMonth(month);

        System.out.printf("Enter day:  ");
        int day = input.nextInt();
        healthRecords.setDay(day);

        System.out.printf("Enter year:  ");
        int year = input.nextInt();
        healthRecords.setYear(year);

        System.out.printf("Enter height:  ");
        int height = input.nextInt();
        healthRecords.setHeight(height);

        System.out.printf("Enter weight:  ");
        int weight = input.nextInt();
        healthRecords.setWeight(weight);




        System.out.printf("healthRecords firstName is %s%n", healthRecords.getFirstName());
        System.out.printf("healthRecords lastName is %s%n", healthRecords.getLastName());
        System.out.printf("healthRecords gender is %s%n", healthRecords.getGender());
        System.out.printf("healthRecords monthOfBirth is %s%n", healthRecords.getMonth());
        System.out.printf("healthRecords dayOfBirth is %d%n", healthRecords.getDay());
        System.out.printf("healthRecords yearOfBirth is %d%n", healthRecords.getYear());
        System.out.printf("healthRecords age is %s%n ", healthRecords.getAge());
        System.out.printf("healthRecords height is %d%n", healthRecords.getHeight());
        System.out.printf("healthRecords weight is %d%n", healthRecords.getWeight());
        System.out.printf("healthRecords maximumHeartRate is %d%n", healthRecords.getMaximumHeartRate());
        System.out.printf("healthRecords targetRate is %f%n ", healthRecords.getTargetRate());
        System.out.printf("healthRecords BMI is %d%n", healthRecords.getBMI());


    }
}
