package Codewars;

public class kata96 {
    public static void main(String[] args) {
        System.out.println(block(new int[] { 1, 3, 5, 7 }, new int[] { 2, 4, 6, 8 }));
        System.out.println(block(new int[] { 2, 9, 9, 7 }, new int[] { 1, 1, 3, 8 }));
        System.out.println(block(new int[] { 5, 2, 2, 4 }, new int[] { 0, 2, 2, 9 }));
    }

    // Нам даны два массива, массив атакующих и массив защищающихся.
    // Вернуть true если вы выживаете атаку или false если вы погибаете.

    // Каждый солдат аттакует солдата по его индексу, т.е. солдат с иендксом 3, будет атаковать обороняющегося солдата
    // под индексом 3, и тд. Выживает солдат с более высоким значением.
    // Если значение (урон) у солдат одиниковый, они оба погибают.

    // Если одна из ячеек (длинна массива) солдата пуста, то оппонент выживает (non empty value soldier)

    // Для того чтобы выжить, защищающаяся сторона должна иметь больше выживших солдат, нежели атакующая сторона.
    // Если атакующих и обороняющихся (выживших) создат одинаковое количество, то выигрывает команда с большим
    // атакующим потенциалом, если total attack power с обоих сторон одинаковый, return true

    // Examples:
    //attackers=[ 1, 3, 5, 7 ]   defenders=[ 2, 4, 6, 8 ]
    //0 survivors                4 survivors
    //return true

    // attackers=[ 1, 3, 5, 7 ]   defenders=[ 2, 4 ]
    ////2 survivors  (16 damage)   2 survivors (6 damage)
    ////return false

    // План
    // Если количество атакующих больше количества вышибших, return false

    // highestInitialPower, сумма всех значений атакующей стороны.
    public static boolean block(int[] attackers, int[] defenders){
        if (attackers.length > defenders.length)
            return false;

        int highestInitialPowerAttackers = 0;
        int highestInitialPowerDefenders = 0;
        for (int initialPower : attackers) {
            highestInitialPowerAttackers += initialPower;   // total power attackers
        }

        for (int initialPower : defenders) {
            highestInitialPowerDefenders += initialPower;   // total power defenders
        }
        if (highestInitialPowerDefenders > highestInitialPowerAttackers)
            return true;
        if (highestInitialPowerAttackers == highestInitialPowerDefenders)
            return true;

        return false;
    }
}
