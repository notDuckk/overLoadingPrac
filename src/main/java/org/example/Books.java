package org.example;


import java.util.Scanner;
import java.util.ArrayList;


public class Books {
    String title;
    int pages;
    int pubYear;

    public Books(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public Books(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String everything() {
        return title + ", " + pages + ", " + pubYear;
    }

    public static void main(String[] args) {
        // BOOK PORTION --------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        ArrayList<Books> myBooks = new ArrayList<>();

        // Adding new book using overloaded constructor
        Books polarPop = new Books("Polar Pop");

        myBooks.add(new Books("To Kill a Mocking Bird",281,1960));
        myBooks.add(new Books("1984",328,1949));
        myBooks.add(new Books("The Great Gatsby",180,1925));
        myBooks.add(new Books("Moby Dick",585,1851));
        myBooks.add(new Books("Pride and Prejudice",279,1813));


        while (true) {
            System.out.println("What information will be printed?");
            String info = input.nextLine();

            if (info.isEmpty()) {
                break;
            } else if (info.equals("everything")) {
                for (Books book : myBooks) {
                    System.out.println(book);
                }
            } else if (info.equals("name")) {
                for (Books book : myBooks) {
                    System.out.println(book.getTitle());
                }
            }
        }
        // BOOK PORTION END -------------------------------------------------------------------------
    }

    @Override
    public String toString() {
        return title + ", " + pages + ", " + pubYear;
    }
}
