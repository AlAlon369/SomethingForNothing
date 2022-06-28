package Homework.Lesson7;

public class Employee {         // < -- access modifier public.  Id, surname видны,
    int id;                        // переменная int id доступна только внутри пакета, по дефолту.
    public String surname;         // (public) переменная String surname доступна отовсюду.
    int age;
    private double salary;         // переменная salary недоступна вне класса


    public Employee(int id2) {                // public access constructor Employee
        id = id2;
    }

    Employee(String surname2) {               // default access constructor Employee
        surname = surname2;
    }

    private Employee(double salary2) {        // private constructor Employee
        salary = salary2;
    }

    double povisheniNaRabote() {
        salary *= 2;
        return salary;
    }

    public void getId() {                         // public void method getId возвращает id на экран
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("SURNAME = " + surname);        // method getSurname
    }

    public void getSalary() {
        System.out.println("SALARY = " + salary);         // getSalary
    }


    public static void main(String[] args) {
        System.out.println();

    }
}