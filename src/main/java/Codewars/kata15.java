package Codewars;

public class kata15 {
    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));
    }
    // Если в секунде 1000 милисекунд, а в минуте 60000, то в часе 36000000 милисекунд.

    public static int Past(int h, int m, int s) {
        return h * 3600000 + m * 60000 + s * 1000;
        //     int miliseconds = 0;
        //     miliseconds = miliseconds * 1000;
        //     miliseconds = miliseconds * 60000;
        //     miliseconds = miliseconds * 36000000;
        //     return miliseconds;

        // Если в секунде 1000 милисекунд, а в минуте 60000, то в часе 36000000 милисекунд.
    }
}
