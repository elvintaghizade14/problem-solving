package hackerrank.day30;

import java.util.Scanner;

public class Day13_abstract_classes {
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

abstract class Book {
  String title;
  String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  abstract void display();
}

class MyBook extends Book {
  int price;

  /**
   * Class Constructor
   *
   * @param title  The book's title.
   * @param author The book's author.
   * @param price  The book's price.
   **/
  MyBook(String title, String author, int price) {
    super(title, author);
    this.price = price;
  }

  /**
   * Method Name: display
   * <p>
   * Print the title, author, and price in the specified format.
   **/
  @Override
  void display() {
    System.out.printf("Title: %s\nAuthor: %s\nPrice: %s\n", this.title, this.author, this.price);
  }
}