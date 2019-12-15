package challengesolutions.Day13;

import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

/**
 * Abstract class with abstract display method.
 *
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

/**
 * MyBook class extends abstract class Book and implements display() abstract method.
 *
 */
class MyBook extends Book {

    int price;

    MyBook(String title, String author, int price) {
        // Call super class constructor
        super(title, author);
        // Set price in this class
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
