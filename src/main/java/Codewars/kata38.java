package Codewars;

import java.util.Locale;

public class kata38 {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("NyffsGeyylB"));

    }
    // 1. split String s, получить массив букв
    // 2. создамем цикл fori, от 0 по length.
    // 3. в теле цикла fori создаем fori int j, сколько раз нужно бежать по циклу? int j = 0, j < i + 1; j++
    // 4. if j = 0, append UpperCase, else LowerCase
    // 5. append "-"
    // 5. Добавить к резальту += append.

    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        String[] characters = s.split("");
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < i + 1; j++)
                if (j == 0)  {
                    sb.append("-");
                    sb.append(characters[i].toUpperCase());
                } else {
                    sb.append(characters[i].toLowerCase());
                }
        }
        String result = sb.toString();
        return result.replaceFirst("[-]", "");
    }
}