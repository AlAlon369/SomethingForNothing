package Codewars;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


import static java.awt.geom.Path2D.contains;

public class kata41 {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }

    // создаю лист объектов.
    // бегу по листу, который у меня в методе. enhanced for
    // Если элемент не является стрингом, тогда добавляю в новый лист element.
    // element instanceOf String (Условие внутри if'a)


    public static List filterList(final List<Object> list) {
        List<Object> list2 = new ArrayList<>();
        for (Object element : list) {
            if (!(element instanceof String))
                list2.add(element);

            }
        return list2;
    }
}
// Оператор instanceof нужен для того, чтобы проверить, был ли объект, на которую ссылается переменная X, создан на основе какого-либо класса Y.