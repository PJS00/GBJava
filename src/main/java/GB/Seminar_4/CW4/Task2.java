/**
 * Задание №1
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя строку вида
 * text~num
 * 2. Нужно рассплитить строку по ~, сохранить text в связный список на
 * позицию num.
 * 3. Если введено print~num, выводит строку из позиции num в связном
 * списке и удаляет её из списка.
 */
package GB.Seminar_4.CW4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        while (true) {
            System.out.println("Введите текст в формате текст~цифра(print~цифра), где цифра - позиция в списке. Текст для добавления текста, print для распечатки");
            System.out.println("Для выхода введите exit");
            String str = scan.nextLine();
            if (str.equals("exit")) {
                break;
            }
            String[] inputStr = str.split("~");
            Integer num = Integer.parseInt(inputStr[1]);
            if (!("print".equals(inputStr[0]))) {
                if (ll.size() >= num) {
                    ll.add(num, inputStr[0]);
                } else {
                    System.out.println("Данной позиции не существует, элемент вставлен в конец");
                    ll.add(inputStr[0]);
                }
            } else {
                if (ll.size() >= num) {
                    System.out.println(ll.get(Integer.parseInt(inputStr[1])));
                } else {
                    System.out.println("Такого элемента еще не существует");
                }

            }
        }
    }
}
