package Others;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // присваивание значений полям в объекте minivan
        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;            // Обратите внимание на использование точечной натации для доступа к переменным экземпляра

        // Расчет дальности поездки с польным баком горючего.
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " + minivan.passangers + " пассажиров на растоянии " + range + " миль");
    }
}
