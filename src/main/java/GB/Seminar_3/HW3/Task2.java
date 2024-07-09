/**
 * Дан произвольный массив целых чисел. Создайте список ArrayList,
 * заполненный данными из этого массива. Необходимо удалить
 * из списка четные числа и вернуть результирующий.
 * Напишите свой код в методе removeEvenNumbers класса Answer.
 * Метод removeEvenNumbers принимает на вход один параметр:
 * Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
 * Примеры.
 * Исходный массив:
 * 1, 2, 3, 4, 5, 6, 7, 8, 9
 * Результат:
 * [1, 3, 5, 7, 9]
 * Исходный массив:
 * 2, 4, 6, 8
 * Результат:
 * []
 */

package GB.Seminar_3.HW3;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : arr) {
            if (item % 2 != 0) {
                list.add(item);
            }
        }
        System.out.println(list);
    }
}
