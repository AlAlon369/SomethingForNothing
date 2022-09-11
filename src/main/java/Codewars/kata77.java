package Codewars;

public class kata77 {
    public static void main(String[] args) {
        System.out.println(printerError("aaabbbbhaijjjm"));
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }

    // На заводе принтер печатает лейблы для коробок. Принтер использует цвета, которые в свою очередь отмечены
    // буквами от "a" до "m"
    // Цвета которые использует принтер записываются в String s, которая является единственным аргументом.
    // Например хорошая управляющая строка (String s) будет aaabbbbhaijjjm, где принтер использовал три разных цвета,
    // три раза цвет а, четыре раза цвет b, один раз цвет h, и один раз цвет а.

    // Иногда возникают проблемы: отсутствие цветов, технический сбой, и выдается плохая строка, например:
    // aaaxbbbbyyhwawiwjjjwwm, с буквами (цветами) не из a до m.

    // Нужно написать функцию printerError которая по заданной строке будет возвращать частоту ошибок принтера
    // в виде строки (String s), представляющей рациональное число, числитель которого - количество ошибок,
    // а знаменатель длина контрольной строки (String s).
    // Не уменьшайте эту дробь до более простого выражения.

    // Строка имеет длинну больше или равную еденице и содержит только буквы от a до z.

    // examples: s="aaabbbbhaijjjm"     printer_error(s) => "0/14"
    // s="aaaxbbbbyyhwawiwjjjwwm"       printer_error(s) => "8/22"

    // План
    // Инициализация переменных countErrors (количество ошибок), и длинны строки (String s) Stringlength
    // Массив chars.
    // Бежим по массиву, считаем ошибки.
    //

    // number до "/" числитель, а number после "/" знаменатель.

    public static String printerError(String s) {
        int countError = 0;
        int printStringLength = s.length();
        char[] arrayWithChars = s.toCharArray();
        for (char collorChar : arrayWithChars) {
            if (collorChar > 'm') {
                countError++;
            }
        }
        return countError + "/" + printStringLength;
    }
}
