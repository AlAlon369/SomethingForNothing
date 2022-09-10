package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kata74 {
    public static void main(String[] args) {
        ArrayList<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(new int[]{10, 0});
        listOfArrays.add(new int[]{3, 5});
        listOfArrays.add(new int[]{2, 5});
        System.out.println(countPassengers(listOfArrays));
    }
    // По городу движется автобус, и на каждой остановке он берет и высаживает несколько человек.
    // Список (или массив) целочисленных пар. Элементы каждой пары представляют количество людей,
    // садящихся в автобус (первый элемент) и количество людей, выходящих из автобуса (второй элемент).

    // Нужно вернуть количество людей, оставшихся в автобусе после последней автобусной остановки (после последнего
    // массива). Несмотря на то, что это последняя автобусная остановка, автобус не пустой, и некоторые люди
    // все еще в автобусе, и они, вероятно, там спят.

    // Количество людей в автобусе всегда >= 0, возвращаемое число не может быть отрицательным.

    // План
    // Инициализировать переменную int, в которой будет количество пассажиров на последней остановке.
    // Пробежаться по массиву.
    // Учитывая что у нас два элемента, добавить один из них в переменную, которая содержит количетсво людей на посл. остановке


    public static int countPassengers(ArrayList<int[]> stops) {
        int peopleGetIntoBuss = 0;
        int lazyPassangers = 0;
        for (int i = 0; i < stops.size(); i++) {
            lazyPassangers += stops.get(i)[0] - stops.get(i)[1];
        }
        return lazyPassangers;
    }
}
