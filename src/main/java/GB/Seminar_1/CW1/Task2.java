//Дана последовательность N целых чисел.
//Найти количество положительных чисел,
//после которых следует отрицательное число.
package GB.Seminar_1.CW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину последовательности: ");
        int n = scanner.nextInt();
        int k = getK(scanner, n);
        System.out.println("k = " + k);
    }

    /**
     * @param scanner
     * @param n
     * @return
     * @apiNote Дана последовательность N целых чисел.
     * Найти количество положительных чисел,
     * после которых следует отрицательное число.
     */
    private static int getK(Scanner scanner, int n) {
        int k = 0;
        int a = scanner.nextInt();
        int b;
        for (int i = 0; i < n - 1; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        return k;
    }
}