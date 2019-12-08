package challengesolutions.Day8;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8 {
    public static void main(String[] argh) {
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (phoneBook.containsKey(s)) {
                int value = phoneBook.get(s);
                System.out.println(s + "=" + value);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}