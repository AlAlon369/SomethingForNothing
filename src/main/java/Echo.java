public class Echo {
    public static void main(String[] args) {
        double sound;
        double dist;

        sound = 7.2 / 2; // получаем время прохождения звука от нас до объекта.
        dist = 1100 * sound; // полученное значение sound уможаем на дистанцию

        System.out.println("Расстояние до скалы равно " + dist + " фута");
    }
}
