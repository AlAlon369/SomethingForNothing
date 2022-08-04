package schildt.chapter6;

public class StaticBlock {
    static double rootof2;
    static double rootof3;

    static {
        System.out.println("Внутри статического блока");
        rootof2 = Math.sqrt(2.0);
        rootof3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри конструктора");
        System.out.println("Корень квадратный из 2 равен " + StaticBlock.rootof2);
        System.out.println("Корень квадратный из 3 равен " + StaticBlock.rootof3);
    }
}
