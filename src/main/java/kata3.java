public class kata3 {
    public static void main(String[] args) {
        System.out.println(repeatStr(6,"I"));            // 6
        System.out.println(repeatStr(5,"Hello"));        // 5

    }


    public static String repeatStr(final int amountOfRepeats, final String word) {
        String result = "";
        for (int i = 0; i < amountOfRepeats; i++) {
            result += word;
        }
        return result;

    }


}


// Напишите вызываемую функцию, repeatStrкоторая повторяет заданную строку stringточное количество nраз.