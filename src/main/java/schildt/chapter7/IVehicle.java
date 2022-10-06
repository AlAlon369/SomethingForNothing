package schildt.chapter7;

public interface IVehicle {

    int range();

    // Количество (объем топлива) которое необходимо.
    double fuelNeeded(int miles);

    // методы доступа

    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
