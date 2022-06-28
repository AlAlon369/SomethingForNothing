package Zaur.lesson5;

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Johny";
        st1.surname = "Green";
        st1.mathAverageGrade = 6.9;
        st1.economicsAverageGrade = 9.6;
        st1.foreignLanguageAverageGrade = 10.0;
        st1.mortalArtsAverageGrade = 8.9;


        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "James";
        st2.surname = "Cameron";
        st2.mathAverageGrade = 9.7;
        st2.economicsAverageGrade = 6.7;
        st2.foreignLanguageAverageGrade = 8.9;
        st2.mortalArtsAverageGrade = 5.5;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Sergey";
        st3.surname = "Mavrodi";
        st3.mathAverageGrade = 10.0;
        st3.economicsAverageGrade = 10.0;
        st3.foreignLanguageAverageGrade = 10.0;
        st3.mortalArtsAverageGrade = 0.0;

        StudentTest sTest = new StudentTest();
        sTest.avgValue(st1);
        sTest.avgValue(st2);
        sTest.avgValue(st3);


    }
    double avgValue(Student st) {
        double averageValue = (st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguageAverageGrade + st.mortalArtsAverageGrade) / 4;
        System.out.println("Средняя арифметическая оценка студента " + st.name + " " + st.surname + ": " + averageValue);
        return averageValue;


    }
}