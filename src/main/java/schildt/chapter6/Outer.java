package schildt.chapter6;

public class Outer {
    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void Analyze() {
        Inner in0b = new Inner();

        System.out.println("Минимум: " + in0b.min());
        System.out.println("Максимум: " + in0b.max());
        System.out.println("Среднее: " + in0b.avg());
    }

    // Внутренний класс
    class Inner {         // <---- Внутренний класс
        int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int a = 0;
            for (int i = 0; i < nums.length; i++)
                a += nums[i];
            return a / nums.length;
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 };
        Outer outOb = new Outer(x);

        outOb.Analyze();
    }
}