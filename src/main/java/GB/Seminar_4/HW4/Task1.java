/**
 * Дан LinkedList с несколькими элементами разного типа.
 * В методе revert класса LLTasks реализуйте разворот
 * этого списка без использования встроенного функционала.
 * Пример
 * // Дан
 * [1, One, 2, Two]
 * // Вывод
 * [1, One, 2, Two]
 * [Two, 2, One, 1]
 */

package GB.Seminar_4.HW4;

import java.util.LinkedList;


public class Task1 {

    public static LinkedList<Object> fillList() {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add("One");
        list.add(2);
        list.add("Two");
        return list;
    }

    public static void printList(LinkedList<Object> list) {
        for (Object el : list) {
            System.out.printf(el + " ");
        }
    }

    public static void replaceList(LinkedList<Object> list) {
        int n = list.size() / 2;
        int m = list.size();
        for (int i = 0; i < n; i++) {
            Object temp = list.get(i);
            list.set(i, list.get(m - i - 1));
            list.set(m - i - 1, temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<Object> listFirst = fillList();
        printList(listFirst);
        replaceList(listFirst);
        System.out.println();
        printList(listFirst);
    }
}