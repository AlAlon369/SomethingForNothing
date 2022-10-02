package schildt.chapter8;

public interface MyIF {
    // объявление обычного метода интерфейса, которое НЕ включает определение реализации по умолчанию.
    int getUserID();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }
}
