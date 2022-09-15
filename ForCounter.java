package assignment;

import java.sql.SQLOutput;

public class ForCounter {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 6; counter++) {
            for (int amirah = 1; amirah <= counter; amirah++) {
                System.out.printf("%d", amirah);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int counter = 6; counter >=1; counter--) {
            for (int amirah = 1; amirah <= counter; amirah++) {
                System.out.printf("%d", amirah);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

            for (int counter = 1; counter <= 6; counter++) {
                for (int amirah = counter; amirah >= 1; amirah--) {
                    System.out.printf("%d", amirah);
                }
                System.out.println();
            }
        System.out.println();
        System.out.println();

        for (int counter = 6; counter >=1; counter--) {
            for (int amirah = 1; amirah <= counter; amirah++) {
                System.out.printf("%d", amirah);
            }
            System.out.println();
        }




    }


}
