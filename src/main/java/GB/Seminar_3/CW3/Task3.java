/**
 * Задание №2.1
 * Заполнить список названиями планет Солнечной
 * системы в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его
 * повторений в списке.
 * <p>
 * Задание №2.2 (если выполнено первое задание)
 * Пройти по списку из предыдущего задания и удалить
 * повторяющиеся элементы.
 */
package GB.Seminar_3.CW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//public class Task3 {
//    public static void main(String[] args) {
//        List<String> planets = new ArrayList<>();
//        planets.add("Меркурий");
//        planets.add("Венера");
//        planets.add("Земля");
//        planets.add("Марс");
//        planets.add("Юпитер");
//        planets.add("Сатурн");
//        planets.add("Уран");
//        planets.add("Нептун");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер списка: ");
//        int n = scanner.nextInt();
//        List<String> rndPlanets = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            rndPlanets.add(planets.get((int) ((Math.random() * planets.size()))));
//        }
//        System.out.println(rndPlanets);
//        Collections.sort(rndPlanets);
//        int count = 0;
//        for (int i = 1; i < rndPlanets.size(); i++) {
//            if (rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
//                count++;
//            } else {
//                System.out.println(rndPlanets.get(i) + " Встретилась " + count + " раз");
//                count = 1;
//            }
//        }
//        System.out.println(rndPlanets.get(rndPlanets.size() - 1) + " Встретилась " + count + " раз");
//
//        scanner.close();
//    }
//}

// 2 задача
public class Task3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();
        List<String> rndPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rndPlanets.add(planets.get((int) ((Math.random() * planets.size()))));
        }
        System.out.println(rndPlanets);
        Collections.sort(rndPlanets);
        int count = 1;
        for (int i = 1; i < rndPlanets.size(); i++) {
            if (rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
                count++;
            } else {
                System.out.println(rndPlanets.get(i) + " Встретилась " + count + " раз");
                count = 1;
            }
        }
        System.out.println(rndPlanets.get(rndPlanets.size() - 1) + " Встретилась " + count + " раз");
        List<String> uniqList = new ArrayList<>();
        for (int i = 1; i < rndPlanets.size(); i++) {
            if (!rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
                uniqList.add(rndPlanets.get(i - 1));

            }
        }
        System.out.println(uniqList);
        scanner.close();
    }
}