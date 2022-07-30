package schildt.chapter6;

 class Overload {
    void ovlDemo() {         // Первая версия метода.
        System.out.println("Без параметров");
    }
    // Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int a) {   // Вторая версия метода
        System.out.println("Один параметр: " + a);
    }
    // Перегрузка метода ovlDemo для двух параметров типа int
    int ovlDemo(int a, int b) {   // Третья версия метода
        System.out.println("Два параметра: " + a + " " + b);
        return a + b;
    }
    // Перегрузка метода ovlDemo для двух параметров типа double
    double ovlDemo (double a, double b) {   // Четвертая версия метода
        System.out.println("Два параметра типа double: " + a + " " + b);
        return a + b;
    }
}
