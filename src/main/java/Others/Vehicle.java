package Others;

public class Vehicle {
    int passangers;          // количество пассажиров
    int fuelcap;             // емкость топливного бака
    int mpg;                 // потребление топлива в милях на галлон

    // определение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // расчет количества топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        Double gallons;
        int dist = 252;

        // присваивание значений полям объекта minivan
        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // присваивание значений полям объекта sportscar
        sportscar.passangers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");
        minivan.range();
        gallons = sportscar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");

        sportscar.range();

    }
}