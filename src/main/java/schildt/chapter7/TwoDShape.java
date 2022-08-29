package schildt.chapter7;

public class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

   // Подкласс для представления треугольников.
   // Производный от класса TwodShape
class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2;      // Из класса Triangle можно обращаться к членам класса TwoDShape так, как если бы это были его собственные члены.
     }

     void showStyle() {
         System.out.println("Треугольник " + style);
     }
  }

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;                     // Объектам типа Triangle доступны все члены класса Triangle, даже те, которые унаследованы от класса TwoDShape
        t1.style = "закрашенный";

        t2.width = 4.0;
        t2.height = 12.0;
        t2.style = "контурный";

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
