/**
 * Задание №0
 * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
 * Сравните с предыдущим.
 */
package GB.Seminar_4.CW4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        long startTimeArray = System.currentTimeMillis();
        ArrayList<Integer> array = getArrayValues();
        long endTimeArray = System.currentTimeMillis();
        long timeElapsedArray = endTimeArray - startTimeArray;

        System.out.println("10000 элементов добавлены в ArrayList и выведены в консоль за " + timeElapsedArray + " миллисекунд(ы)");

        long startTimeList = System.currentTimeMillis();
        LinkedList<Integer> list = getListValues();
        long endTimeList = System.currentTimeMillis();
        long timeElapsedList = endTimeList - startTimeList;

        System.out.println("10000 элементов добавлены в LinkedList и выведены в консоль за " + timeElapsedList + " миллисекунд(ы)");
    }

    private static ArrayList<Integer> getArrayValues() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
//            array.addFirst(i); //добавляет в начало
//            array.add(i); //добавляет в конец
            array.add(array.size()/2, i); // добавляет в середину
        }
        return array;
    }

    private static LinkedList<Integer> getListValues() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
//            list.addFirst(i); // добавляет в начало
//            list.add(i); // добавляет в конец
            list.add(list.size()/2, i); // добавляет в середину
        }
        return list;
    }
}
