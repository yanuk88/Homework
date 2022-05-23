package Homework.course1.lesson9;

import java.util.Objects;

public class Book {
    final String title;
    final Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {

        return this.author;
    }

    public int getYear() {

        return this.year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author + ", Год издания: " + year;
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.getTitle())&&
                Objects.equals(author, book.getAuthor())&&
                Objects.equals(year, book.getYear());
    }


}
