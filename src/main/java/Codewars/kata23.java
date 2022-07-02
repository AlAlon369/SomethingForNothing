package Codewars;

public class kata23 {
    public static void main(String[] args) {
        System.out.println(setAlarm(true,false));
        System.out.println(setAlarm(true,true));
        System.out.println(setAlarm(false,false));
        System.out.println(setAlarm(false,true));

    }

    // Написать функцию setAlarm, которая получает два параметра, первый used, который истенен когда вы работаете.
    // Второй парамент Vacation истинен, когда вы находитесь в отпуске, т.е. нам должен приходить false
    // ибо мы не рабоаем, и нам не нужен будильник.


    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed == true && vacation == true) {       // На работе и на отдыхе, будильник не нужен - false.
            return false;
        }
          else if (employed == false && vacation == false) {     // Не на работе, и не на отдыхе, будильник не нужен.
              return false;
        }
          else if (employed == false && vacation == true) {      // Не на работе, в отпуске, будильник не нужен.
              return false;
        } else {
              return true;            // Когда ты на работе, и не в отпуске. нужен будильник.
        }
    }
}
