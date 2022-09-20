package Codewars;

public class kata90 {
    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        System.out.println(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }

    // Создайте функцию, которая возвращает имя победителя в бивте fighter 1 vs fighter 2.
    // Каждый fighter получает бьет по очереди, но кто-то бьет первый. Если у fighter health <= 0, он умирает.
    // Оба интеджера health и damagePerAttack > 0.

    // План
    // Создать переменную, придумать как сделать так, чтобы задействовать стрингу firstAttacker.
    // Придумать как можно отработать с ифами.
    // Какую стрингу возвращать?
    // инициализация стринги Winner(result)
    // Не понимаю.

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (true) {
            if (fighter1.name.equals(firstAttacker)) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
            }
        }
    }
}
