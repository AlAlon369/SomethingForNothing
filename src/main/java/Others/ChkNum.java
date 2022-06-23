package Others;

public class ChkNum {
    // Возвращение логического значения true,
    // если x содержит четное число.
    boolean isEven(int x) {
        if ((x%2) == 0) return true;           // x - целочисленные параметр метода isEven()
        else return false;
    }
}


    class ParmDemo {
        public static void main(String[] args) {
            ChkNum e = new ChkNum();

            if (e.isEven(10)) System.out.println("10 - четное число "); //   перелача аргумента методу isEven() 10.
            if (e.isEven(9)) System.out.println("9 - четное число ");   //   перелача аргумента методу isEven() 9.
            if (e.isEven(8)) System.out.println("8 - четное число ");   //   перелача аргумента методу isEven() 8.
        }
    }