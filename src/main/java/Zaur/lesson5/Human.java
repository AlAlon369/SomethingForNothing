package Zaur.lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Imya: " + name + " cvet mashini:" + car.color + " Balance bankovskogo scheta: " + bA.balance);
    }


}
