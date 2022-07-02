package Codewars;

public class kata22 {
    public static void main(String[] args) {
        System.out.println(otherAngle(45,12));
        System.out.println(otherAngle(50,60));

    }
    // Даны два внутренних угла (в градусах) фигуры треугольника.
    // Напишите функцию, возвращающую 3-ий угол.
    // A + B + C = 180 градусов.
    // Тест будут проходить только положительные целые числа.

    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }

}
