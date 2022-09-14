package Codewars;

import java.util.ArrayList;
import java.util.List;

public class kata82 {
    public static void main(String[] args) {
        System.out.println(predictAge(65,60,75,55,60,63,64,45));
        System.out.println(predictAge(32,54,76,65,34,63,64,45));
    }
      // Мой дедушка всегда предсказывал, как стареют люди, и прямо перед смертью раскрыл свой секрет.
      // В честь памяти моего дедушки мы напишем функцию по его формуле!
      // Составьте список возрастов, когда каждый из ваших прадедов умер.
      // Умножьте каждое число само на себя.
      // Запишите даты в виде аргументов которые принимает метод.
      // Возьмите квадратный корень из результата.
      // Разделите на два.

      // План
      // Добавить все даты в список (list)
      // Умножить каждую дату на себя.
      // Сложить все даты вместе.
      // Получить квадратный корень числа (всех дат)
      // Разделить на два. (Округлить в меньшую сторону)



    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        List<Integer> deathNote = new ArrayList<>();
        deathNote.add(age1 * age1);
        deathNote.add(age2 * age2);
        deathNote.add(age3 * age3);
        deathNote.add(age4 * age4);
        deathNote.add(age5 * age5);
        deathNote.add(age6 * age6);
        deathNote.add(age7 * age7);
        deathNote.add(age8 * age8);
        int sumOfAges = 0;
        for (Integer element : deathNote) {
            sumOfAges += element;
        }
        double mathResult = Math.sqrt(sumOfAges);

        return (int) mathResult / 2;
    }
}
