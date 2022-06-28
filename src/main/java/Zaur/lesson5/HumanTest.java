package Zaur.lesson5;

public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "v8");
        h.bA = new BankAccount(6, 200);
        h.info();

    }
}
