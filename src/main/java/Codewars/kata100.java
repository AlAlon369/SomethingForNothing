package Codewars;

public class kata100 {
    public static void main(String[] args) {
        System.out.println(movie(500, 15, 0.9));
        System.out.println(movie(100, 19, 0.95));
    }
    // Джон любит ходить в кино, и он может выбирать одну и систем оплаты (покупки билетов)
    // Джон идет в кино три раза:
    // System A: 15 * 3 = 45 (где 15 долларов это цена билета)
    // System B: 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90 ( = 536.5849999999999,
    // no rounding for each ticket) (где 500 долларов, это цена карты)

    // Джон хочет знать, сколько раз ему нужно сходить в кино, чтобы конечный результат System B (card, 500 $) при
    // округлении до следующего доллара был дешевле, чем система A (15 $ per ticket)

    // Функция movie имеет три параметра, card (цена карты), ticket (нормальная цена билета), perc (доля того, что он
    // заплатил за предыдущий билет) и возвращает первый n такой, что ceil(price of System B) < price System A.

    // План
//     Инициализировать количество походов в кино, системаА(билеты), СистемаB(card 500, 100 $)
//     В цикле while
//     использую метод Math.ceil, cardSystemB (card) округляю дробь в большую сторону
//     далее цикл работает до тех пор, пока cardSystemB не будет больше или ровна ticketSystemA
//     Получаю количество походов в кино.
//     В переменную ticketSystemA добавляю цену билета, получая сумму без скидки.
//     В переменную cardSystemB  добавляю стоимость билета, учитывая скидку.
//     Возвращаю количество визитов по скидочной системе cardSystemB


    public static int movie(int card, int ticket, double perc) {
        int visits = 0;
        double ticketSystemA = 0; // 15 $
        double cardSystemB = card;     // 500, 100 $
        while (Math.ceil(cardSystemB) >= ticketSystemA) {
            visits++;
            ticketSystemA += ticket;
            cardSystemB += ticket * Math.pow(perc, visits);
        }
        return visits;
    }
}
