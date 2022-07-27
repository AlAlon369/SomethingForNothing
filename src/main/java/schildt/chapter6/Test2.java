package schildt.chapter6;

   class Test2 {
    int a, b;

    Test2 (int i, int j) {
        a = i;
        b = j;
    }

    // Передача объекта методу. Теперь переменные ob.a и ob.b объекта, используемого при вызове, также будут изменяться.
       void change (Test2 ob) {   // Как видите, в данном случае действия в методе change() оказывают влияние на объект,
        ob.a = ob.a + ob.b;       // используемый в качетсве аргумента этого метода
        ob.b = -ob.b;
    }
}

      class CallByRef {
          public static void main(String[] args) {
              Test2 ob = new Test2(15,20);

              System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
              ob.change(ob);

              System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
          }
      }