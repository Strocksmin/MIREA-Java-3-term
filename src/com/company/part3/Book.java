package com.company.part3;

import java.util.ArrayList;

class BookArray {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(String name, String author, String genre) {
        Book d = new Book(name, author, genre);
        books.add(d);
    }
}

public class Book {
    private String name, author, genre;

    public Book(String n, String a, String g) {
        name = n; author = a; genre = g;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}

class BookTest {
    public static void main(String[] args) {
        BookArray books = new BookArray();
        books.addBook("11/22/63", "Stiven King", "Romance");
        books.addBook("Ozark", "Stiven Pig", "Drama");
        books.addBook("Funny day", "Funny Human", "Comedy");

        for(int i = 0; i < books.books.size(); i++) {
            System.out.println(books.books.get(i));
        }
    }
}
