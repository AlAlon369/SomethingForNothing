package Codewars;

public class kata28 {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(4 , 4));
        System.out.println(areaOrPerimeter(6 , 10));
    }

    // Нам известна длинна (l) и высота (w) четырех угольника.
    // Прямоугольник может быть прямоугольным или квадратным.
    // Если это квадрат, вернуть его площадь, если прямоугольник, вернуть его периметр.
    // Если


    public static int areaOrPerimeter (int l, int w) {
        if (l == w) {           // Длинна и высота равны
            return l * w;       // В теле ретёрним длинну на высоту.
        }
        return l * 2 + w * 2;        // Получаем периметр.
    }
}
