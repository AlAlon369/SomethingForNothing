package schildt.bookpackext;
import schildt.bookpack.Book;

// Использование класса Book из пакета bookpack
public class UseBook {
    public static void main(String[] args) {
        schildt.bookpack.Book books[] = new schildt.bookpack.Book[5];
        books[0] = new schildt.bookpack.Book("Java: руководство для начинающих 7-е издание", "Герберт Шилдт", 2018);
        books[1] = new schildt.bookpack.Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[2] = new schildt.bookpack.Book("Искусство программирования на Java", "Герберт Шилдт", 2005);
        books[3] = new schildt.bookpack.Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new schildt.bookpack.Book("В дороге", "Джек Керуак", 2012);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
