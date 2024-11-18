package CodewarsVolume2;

public class SmallEnough {

  public static void main(String[] args) {
    // Тестовые примеры
    System.out.println(smallEnough(new int[]{66, 101}, 200));
    System.out.println(smallEnough(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100));
    System.out.println(smallEnough(new int[]{101, 45, 75, 105, 99, 107}, 107)); // true
    System.out.println(smallEnough(new int[]{80, 117, 115, 104, 45, 85, 112, 115}, 120));
    System.out.println(smallEnough(new int[]{1, 2, 3, 4, 5}, 0));
  }

  public static boolean smallEnough(int[] a, int limit) {
    for (int element : a) {
      if (element > limit) {
        return false;
      }
    }
    return true;
  }
}
