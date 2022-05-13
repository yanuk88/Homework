package Homework.course1.lesson9;

public class Main  {
    public static void main(String[] args) {
        Author shev = new Author("Тарас", "Шевченко");
        Author gog = new Author("Николай", "Гоголь");
        Book kob = new Book("Кобзарь", shev, 1840);
        Book viy = new Book("Вий", gog, 1833);

    }
}
