package challengesolutions.Day16;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

}
