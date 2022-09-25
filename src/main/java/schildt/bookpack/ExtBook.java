package schildt.bookpack;

// Пример использования модификатора protected
    class ExtBook extends schildt.bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() { return publisher; }
    public void setPubliusher(int p) {
        pubDate = p;
    }

    // Следующие инструкции допустимы, пскольку подклассы имеют право доступа к членам класса, объявленным защищенными.
    public String getTitle() { return title; }
    public void setTitle (String t) { title = t; }
    public String getAuthor() { return author; }     // Доступ к членам класса Book разрешен для подклассов.
    public void setAuthor (String a) { author = a; }

    public int getPubDate() { return pubDate; }
    public void setPubDate(int d) { pubDate = d; }
    }

    class ProtectDemo {
        public static void main(String[] args) {
            ExtBook books [] = new ExtBook[5];

            books[0] = new ExtBook("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018, "Вильямс");
            books[1] = new ExtBook("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018, "Вильямс");
            books[2] = new ExtBook("Искусство программирования на Java", "Герберт Шилдт", 2003, "Диалектика");
            books[3] = new ExtBook("Красный шторм поднимается", "Том Клэнси", 2006, "Эксмо");
            books[4] = new ExtBook("В дороге", "Джек Керуак", 2012, "Азбука");

            for (int i = 0; i < books.length; i++) books[i].show();

            // Поиск книг по автору
            System.out.println("Все книги Герберта Шилдта.");
            for (int i = 0; i < books.length; i++) {
                if (books[i].getAuthor() == "Герберт Шилдт")
                    System.out.println(books[i].getTitle());
            }
                // books[0].title = "test title"; // Ошибка: доступ запрещен!
        }       // Доступ к защищенным полям класса Book возможен только из егшо подклассов.
}
