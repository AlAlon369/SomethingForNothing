package schildt.chapter7;

public class TwoDShape {
   private double width;        // теперь эти переменные объявлены как закрытые
   private double height;       // теперь эти переменные объявлены как закрытые

    // Методы доступа к переменным экземпляра width и height
    // Параметризированный конструктор
    TwoDShape (double w, double h) {       // <-- Конструктор класса TwoDShape
        width = w;
        height = h;
    }
    // Конструктор, заданный по умолчанию             // Использование метода super() для вызова разных форм конструктора TwoDShape()
    TwoDShape() {
        width = height = 0.0;
    }
    // Создание объекта с одинаковыми значениями переменных экземпляра width и height
    TwoDShape (double x) {
        width = height = x;
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

    // Конструктор по умолчанию
    Triangle() {
        super();     // Вызов конструктора суперкласса по умолчанию
        style = "nonme";
    }
    // конструктор
    Triangle (String s, double w, double h) {
        super(w, h);     // Вызов конструктора суперкласса с двумя аргументами.

        style = s;
    }

    // Конструктор с одним аргументом
    Triangle (double x) {
        super(x);  // Вызов конструктора суперкласса с одним аргументом.

        style = "закрашенный";
    }
    double area() {
        return getWidth() * getHeight() / 2;      // Из класса Triangle можно обращаться к членам класса TwoDShape так, как если бы это были его собственные члены.
    }

    void showStyle() {

        System.out.println("Треугольник " + style);
    }
}

// Расширение класса Triangle
class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super (s, w, h);

        color = c;
    }

    String getColor() { return color; }

    void showColor() {
        System.out.println("Цвет - " + color);
    }
}

class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle ("Синий", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle ("Красный", "закрашенный", 2.0, 2.0);

        System.out.println("Информация о t1: ");
        t1.showStyle();

        t1.showDim();
        t1.showColor();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация o t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Площадь - " + t2.area());
    }
}


