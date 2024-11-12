package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kata103 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(3)));
        System.out.println(Arrays.toString(sumOfN(-4)));
        System.out.println(Arrays.toString(sumOfN(1)));
        System.out.println(Arrays.toString(sumOfN(0)));
    }


    public static int[] sumOfN(int n) {
        int value = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n ; i++) {
            value += i;
            list.add(value);
        }
        for (int i = 0; i >= n ; i--) {
            value += i;
            list.add(value);
        }
        if (list.equals(List.of(0, 0)))
            return new int[]{0};

        return list.stream().mapToInt(i -> i).toArray();
    }
}
