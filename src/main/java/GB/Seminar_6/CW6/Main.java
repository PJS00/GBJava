/**
 * Задание №2
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
 * приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
package GB.Seminar_6.CW6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.id = 1;
        cat1.name = "Mimi";
        cat1.color = "black";
        cat1.age = 2;
        cat1.ovner = "Tom";

        Cat cat2 = new Cat();
        cat2.id = 2;
        cat2.name = "Барсик";
        cat2.color = "red";
        cat2.age = 3;
        cat2.ovner = "Иван";

        System.out.println(Arrays.asList(cat1, cat2));

        Set<Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat1));
        System.out.println(cats);
        System.out.println(cat1.equals(cat1));

        HashSet<Cat> cats2 = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            cats2.add(new Cat());
        }
        long end = System.currentTimeMillis();
        System.out.println("Время создания: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            cats2.contains(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Время проверки: " + (end - start));
    }

}
