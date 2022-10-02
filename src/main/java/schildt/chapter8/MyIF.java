package schildt.chapter8;

public interface MyIF {
    // объявление обычного метода интерфейса, которое НЕ включает определение реализации по умолчанию.
    int getUserID();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }
}

class MyIFImp implements MyIF {
    // Реализации подлежит лишь метод getUserID() интерфейса MyIF.
    // Делать это для метода getAdminID() необязательно, поскольку при необходимости может быть использована
    // его реализация, заданная по умолчанию.

    public int getUserID() {
        return 100;
    }
}

// Использование интерфейсного метода по умолчанию.
class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        // Вызов метода getUserID() возможен, поскольку он явно реализован классом MyIFImp
        System.out.println("Идентификатор пользователя " + obj.getUserID());

        // Вызов метода getAdminID() также возможен, поскольку представляется его реализация по умолчаниюб
        System.out.println("Идентификатор администратора: " + obj.getAdminID());
    }
}
