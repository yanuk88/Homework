package Homework.course1.lesson9;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Имя: " + name + ", Фамилия: " + firstName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(name, author.getName()) && Objects.equals(firstName, author.getFirstName());
    }


}
