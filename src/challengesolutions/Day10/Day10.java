package challengesolutions.Day10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {

    private static final String _zero = "0";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int i = 0;
        for (String b : Integer.toString(n, 2).split(_zero))
            if (i < b.length())
                i = b.length();
        System.out.println(i);

        scanner.close();
    }
}
