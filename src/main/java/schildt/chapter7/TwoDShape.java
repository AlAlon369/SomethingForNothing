package schildt.chapter7;

public class TwoDShape {
   private double width; // теперь эти переменные объявлены как закрытые
   private double height;       // теперь эти переменные объявлены как закрытые

    // Методы доступа к переменным экземпляра width и height
    // Параметризированный конструктор
    TwoDShape (double w, double h) {       // <-- Конструктор класса TwoDShape
        width = w;
        height = h;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth (double w) { width = w; }
    void setHeight (double h) { height = h; }

    void showDim() {

        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

// Подкласс для представления треугольников.
// Производный от класса TwodShape
class Triangle extends TwoDShape {
    private String style;

    // Конструктор
    Triangle (String s, double w, double h) {
        super(w, h);     // Вызов конструктора суперкласса
                         // Super - Использование оператора super() для вызова конструктора класса TwoDShape

        style = s;
    }
    double area() {
        return getWidth() * getHeight() / 2;      // Из класса Triangle можно обращаться к членам класса TwoDShape так, как если бы это были его собственные члены.
    }

    void showStyle() {

        System.out.println("Треугольник " + style);
    }
}

class Shapes4 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("закрашенный", 4.0, 4.0);
        Triangle t2 = new Triangle("Контурныйй", 8.0, 12.0);


        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();

        System.out.println("Площадь - " + t2.area());
    }
}

