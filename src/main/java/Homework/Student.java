package Homework;

public class Student {

    public Student(int studentid2, String name2, String surname2, int course2, double mathAverageGrade2, double economicsAverageGrade2, double foreignLanguageAverageGrade2) {
        studentid = studentid2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicsAverageGrade = economicsAverageGrade2;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade2;
    }

    Student(int studentid3, String name3, String surname3, int course3) {
        this(studentid3, name3, surname3, course3, 0, 0, 0);

    }


    Student() {
    }

    int studentid;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;


    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentid = 1;
        st1.name = "NIKOLAS";
        st1.surname = "CAGE";
        st1.course = 5;
        st1.mathAverageGrade = 9.9;
        st1.economicsAverageGrade = 9.3;
        st1.foreignLanguageAverageGrade = 10.0;


        Student st2 = new Student(2, "Johny", "Depp", 1);
        st2.mathAverageGrade = 5.5;
        st2.economicsAverageGrade = 8.8;
        st2.foreignLanguageAverageGrade = 9.9;

        Student st3 = new Student(3, "Arnold", "Swarznigger", 4, 0.5, 5.0, 10.0);
        System.out.println(st3.name);

    }
}

