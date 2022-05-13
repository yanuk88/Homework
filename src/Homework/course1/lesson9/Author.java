package Homework.course1.lesson9;

public class Author {
    final String name;
    final String firstName;

    public Author(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;

    }

    public String getName() {
        return this.name;
    }

    public String getFirstName() {
        return this.firstName;
    }
}
