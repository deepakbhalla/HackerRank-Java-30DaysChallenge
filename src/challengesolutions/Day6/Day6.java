package challengesolutions.Day6;

import java.io.*;
import java.util.*;

public class Day6 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int n = scan.nextInt();
        String a;
        for (int i = 0; i < n; i++) {
            a = scan.next();
            for (int j = 0; j < a.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(a.charAt(j));
                }
            }
            System.out.print(' ');

            for (int j = 0; j < a.length(); j++) {
                if (j % 2 != 0) {
                    System.out.print(a.charAt(j));
                }
            }
            System.out.println();
        }
    }
}