package challengesolutions.Day1;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables. */
        int x = scan.nextInt();
        double y = scan.nextDouble();
        String z = scan.nextLine();
        z = scan.nextLine();

        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(x + i);
        /* Print the sum of the double variables on a new line. */
        System.out.println(y + d);

        /*
         * Concatenate and print the String variables on a new line; the 's' variable
         * above should be printed first.
         */
        System.out.println(s + z);
        scan.close();
    }
}
