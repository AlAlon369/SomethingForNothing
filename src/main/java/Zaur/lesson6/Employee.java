package Zaur.lesson6;

public class Employee {
    Employee(int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }

    Employee(String surname2, int age2) {
        surname = surname2;
        age = age2;
    }

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;

    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

}
