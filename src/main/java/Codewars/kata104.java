package Codewars;

public class kata104 {
    public static void main(String[] args) {
        System.out.println(bumps("n"));
        System.out.println(bumps("__nn_nnnn__n_n___n____nn__nnn"));
        System.out.println(bumps("nnn_n__n_n___nnnnn___n__nnn__"));
        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        System.out.println(bumps("______n___n_"));
        System.out.println(bumps("nnnnnnnnnnnnnnnnnnnnn"));
    }

    // Твоя машина старая и легко ломается. Амортизаторы счезли, и вы думаете, что он может выдержать еще около
    // 15 ударов, прежде чем полностью сломается.

    // К сожалению для вас, ваш диск очень ухабистый! Дана строка, показывающая либо ровную доррогу ( _), либо
    // неровности ( n). Если вы можете безопасно добраться до дома, встретив 15 bumps, или меньше, вернитесь Woohooo!
    // в противном случае возвращаем Car Dead

    // План
    // Инициализация (счетчик) количества препядствий, или ровных символов (чаров) в стринге road.
    // Создание стринги result
    // Пробежаться по длинне стринги road, посчитать "_" и "n", где _ flat, n - bump
    // Если bumpcaunt <= 15 return Woohoo!
    // else return Car Dead


    public static String bumps(final String road) {
        int obstacles = 0;
        for(int i = 0; i < road.length(); i++){
            if (road.charAt(i) == 'n')
                obstacles++;
            }
        if(obstacles > 15) {
            return "Car Dead";
        } else  return "Woohoo!";

    }
}


