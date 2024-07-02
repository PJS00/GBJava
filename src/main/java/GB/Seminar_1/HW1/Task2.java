/**
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
 * Напишите свой код в методе printPrimeNums класса Answer.
 * Пример
 * 2
 * 3
 * 5
 * 7
 * 11
 * ...
 */

package GB.Seminar_1.HW1;

public class Task2 {
    public static void main(String[] args) {
        printPrimeNums();
    }

    public static void printPrimeNums() {
        // Напишите свое решение ниже
        for (int i = 1; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                int res = i % j;
                if (res == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
        }
    }
}
