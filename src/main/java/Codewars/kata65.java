package Codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public class kata65 {
    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        System.out.println(longest("inmanylanguages", "theresapairoffunctions"));
    }
    // Приходят две строки, s1 и s2, включить только буквы от a до z.
    // Метод должен возвращать новую отсортированную строку, максимально длинную,
    // содержащую различные буквы (каждая из которых взята только один раз) из s1 и s2.

    // План
    // Получить массив из s1 и s2.
    // Сложить два массива, получу один массив.
    // Отсортировать массив, где буквы будут с повторами.
    // Убрать повторяющиеся чарактеры.
    // Превратить массив в строку.


    public static String longest(String s1, String s2) {
        String[] arrayS1 = s1.split("");
        String[] arrayS2 = s2.split("");
        String[] twoToOne = Stream.of(arrayS1, arrayS2).flatMap(Stream::of).toArray(String[]::new);
        Arrays.sort(twoToOne);


        StringBuilder sb = new StringBuilder();
        sb.append(twoToOne[0]);
        for (int i = 1; i < twoToOne.length; i++) {
            if (!twoToOne[i - 1].equals(twoToOne[i])) {
                sb.append(twoToOne[i]);
            }
        }

        return sb.toString();

    }
}


