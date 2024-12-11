package CodewarsVolume2;

public class ResponsibleDrinking {
  public static void main(String[] args) {
    Drinkin drinkin = new Drinkin();

    // Примеры вызова метода и их вывод
    System.out.println(drinkin.hydrate("1 beer")); // "1 glass of water"
    System.out.println(drinkin.hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer")); // "10 glasses of water"
    System.out.println(drinkin.hydrate("1 chainsaw and 2 pools")); // "3 glasses of water"
    System.out.println(drinkin.hydrate("")); // "0 glasses of water"
    System.out.println(drinkin.hydrate("No drinks here")); // "0 glasses of water"
  }
}

// План
// Нам дана стринга, в которой содержится количество напитков, допустим 5 beer, 1 шот  т.д.
// Нам нужно написать функцию, которая будет возвращать n  "glasses of water", где n подразумевает количество напитков.
// Написать переменную которая будет хранить значение напитков. (их сумму)
// Разделить входную строку drinkString на отдельные слова (например, используя метод split по пробелу или запятой).
// Пройти по каждому слову из разделенной строки.
// роверить, является ли текущее слово числом. Для этого можно попытаться преобразовать его в целое число
// C помощью (Integer.parseInt) или использовать регулярное выражение.
// Если слово является числом, добавить его значение к итоговой переменной.
// Если оно равно 1, вернуть строку "1 glass of water".
// В противном случае вернуть строку вида "<количество> glasses of water".

class Drinkin {
  public String hydrate(String drinkString) {
    // Инициализируем количество напитков
    int totalDrinks = 0;

    // Разделяем строку на слова, используя регулярное выражение для пробелов и запятых
    String[] words = drinkString.split("[^\\d]+");

    // Итерируем по каждому слову
    for (String word : words) {
      if (!word.isEmpty()) { // Проверяем, что строка не пустая
        totalDrinks += Integer.parseInt(word); // Добавляем числовое значение к общему количеству
      }
    }

    // Формируем строку ответа
    return totalDrinks == 1
      ? "1 glass of water"
      : totalDrinks + " glasses of water";
  }
}