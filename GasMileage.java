import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        int milesDriven = 0;
        int amountOfGallonsUsed = 0;
        double averageTrips = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles driven: ");
        int miles = input.nextInt();
        System.out.println();

        System.out.print("Enter amount of gallons used: ");
        int gallon = input.nextInt();
        System.out.println();

        while (miles != -1 && gallon != -1) {
            total = (double) miles / gallon;
            System.out.println("The amountOf Gallon used per trip is:" + total);

            System.out.println(" the miles per gallon used for each trip is: " + total);
            System.out.print("Enter miles driven: ");
            miles = input.nextInt();
            System.out.println();

            System.out.print("Enter amount of gallons used: ");
            gallon = input.nextInt();
            System.out.println();

            if (total!= 0){
                 averageTrips = total + averageTrips;
            }

        }
        System.out.printf(" The total amountOfGallonsUsed is %.2f",averageTrips);


    }



}
