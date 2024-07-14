/**
 * В классе MyQueueInt реализуйте очередь для типа
 * данных Integer с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди
 * dequeue() - возвращает первый элемент из очереди и удаляет его
 * first() - возвращает первый элемент из очереди, не удаляя
 * getElements() - возвращает все элементы в очереди
 * Пример
 * queue.enqueue(1);
 * queue.enqueue(10);
 * queue.enqueue(15);
 * queue.enqueue(5);
 * System.out.println(queue.getElements());
 * Результат:
 * [1, 10, 15, 5]
 * queue.dequeue();
 * queue.dequeue();
 * System.out.println(queue.getElements());
 * Результат:
 * [15, 5]
 * System.out.println(queue.first());
 * Результат:
 * 15
 */

package GB.Seminar_4.HW4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static Deque<Object> fillList() {
        Deque<Object> list = new LinkedList<>();
        list.add(1);
        list.add(10);
        list.add(15);
        list.add(5);
        return list;
    }

    public static void printList(Deque<Object> list) {
        for (Object el : list) {
            System.out.printf(el + " ");
        }
        System.out.println();
    }

    public static void enqueue(Deque<Object> list) {
        System.out.println("Введите элемент, который надо добавить: ");
        Scanner sc1 = new Scanner(System.in);
        Object element = sc1.nextLine();
        list.addLast(element);
        sc1.close();
    }

    public static Object dequeue(Deque<Object> list) {
        Object item = list.pollFirst();
        return item;
    }

    public static Object first(Deque<Object> list) {
        return list.peekFirst();
    }

    public static void main(String[] args) {
//        Deque<Object> que = new LinkedList<>();
//        que = fillList();
//        printList(que);
//        System.out.println("Введиет номер операции: 1 — поместить элемент в конец очереди; 2 — вернуть первый элемент из очереди и удалить его; 3 — вернуть первый элемент из очереди, не удаляя; 4 — завершение работы");
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            int cmd = sc.nextInt();
//            if (cmd == 1) {
//                enqueue(que);
//                printList(que);
//                continue;
//            }
//            if (cmd == 2) {
//                System.out.println("Первый элемент: " + dequeue(que));
//                printList(que);
//                continue;
//            }
//            if (cmd == 3) {
//                System.out.println("Первым элементом был: " + first(que));
//                continue;
//            }
//            if (cmd == 4) break;
//            else {
//                System.out.println("Для выхода из программы введите 4");
//            }
//            sc.close();
//        }
        MyQueueInt queue;
        queue = new MyQueueInt();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());

    }
}