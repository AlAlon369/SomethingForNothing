package Homework.Lesson7;

public class EmployeeTest {                                 // создает три объекта emp1, emp2, emp3.
    public static void main(String[] args) {
        Employee emp1 = new Employee(3);               // Обращение к конструктору с access public, хранящий в себе int (id)
        Employee emp2 = new Employee("Lazar");    //  Обращаемся к конструктору с access default, хранящий в себе стрингу. (surName)
       // Employee emp3 = new Employee(36.9);               // Обращение к конструктору на ссоздание emp3, там private access, нихрена не работает. double (salary)


        System.out.println(emp1.id);                  // access modifier default.
        System.out.println(emp1.surname);             // access modifier public.
        //System.out.println(emp1.salary(36.9));        // // access modifier private
        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        //System.out.println(emp2.salary);

        emp1.getId();
        emp1.getSurname();         // методы get
        emp1.getSalary();





    }
}
