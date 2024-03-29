package schildt.bookpack;

public class Book {                  // Класс Book и его члены должны быть объявлены открытыми, чтобы их можно было использовать в других пакетах.
    protected String title;
    protected String author;                   // Теперь переменные объявлены как protected.
    protected int pubDate;

    // Теперь конструктор стал открытым
    public Book (String t, String a, int d) {
        title = t;
        author = a;
        pubDate =- d;
    }
    // Теперь метод стал открытым
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book [] books = new Book[5];

        books[0] = new Book("Java: руководство для начинающих, 7 издание", "Герберт Шилдт", 2018);
        books[1] = new Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[2] = new Book("Искусство программирования на Java", "Герберт Шилдт", 2005);
        books[3] = new Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new Book("В дороге ", "Джек Керуак", 2012);
        for (int i = 0; i < books.length; i++)
            books[i].show();
    }
}