package Homework;

public class BankAccount {

    int id = 369;
    String name = "Oleg";
    int balance = 10000;

    void popolnenieScheta(int summaPopolneniya) {
        System.out.println("Balance before replenishment is: " + " " + balance);
        System.out.println("Balance is up to: " + " + " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balance after replenishment is: " + " " + balance);

    }

    void snyatieSoScheta(int summaSnyatiya) {
        System.out.println("Balance before withdrawal is:  " + " " + balance);
        System.out.println("Balance is reduced by: " + " " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balance after withdrawal is: " + " " + balance);
        System.out.println();

    }


    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.popolnenieScheta(400);
        myAccount.snyatieSoScheta(500);

    }


}

