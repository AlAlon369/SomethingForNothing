package schildt.chapter8;

public interface IVehicle {

    // Дальность поездки транспорта
    int range();

    // Объем топлива которое потребуется для прохождения пути
    double fuelneeded (int miles);

    // Методы доступа к переменным
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
