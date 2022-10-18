package schildt.chapter8;

public interface MyIF {
    // объявление обычного метода интерфейса, которое НЕ включает определение реализации по умолчанию.
    int getUserID();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }



    // Объявление статического метода интерфейса
    static int getUniversalID() {
        return 0;
    }
}


//   int uID = MyIF.getUniversalID();


// Использование интерфейсного метода по умолчанию.
class DefaultMethodDemo {
    public static void main(String[] args) {

    //    MyIFImp obj = new MyIFImp();

        // Вызов метода getUserID() возможен, поскольку он явно реализован классом MyIFImp
     //   System.out.println("Идентификатор пользователя " + obj.getUserID());

        // Вызов метода getAdminID() также возможен, поскольку представляется его реализация по умолчаниюб
      //  System.out.println("Идентификатор администратора: " + obj.getAdminID());
    }
}

class MyIFImp2 implements MyIF {
    // Представляются реализции обоих методов - getUserID() и getAdminID()
    public int getUserID() {
        return 100;
    }
    public int getAdminID() {
        return 42;
    }
}
