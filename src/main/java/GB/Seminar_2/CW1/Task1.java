/**
 * Задание №1
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая
 * состоит из чередующихся символов c1 и c2, начиная с c1.
 */

package GB.Seminar_2.CW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        newString(n);
    }

    private static void newString(int n) {
        String line1 = "c1";
        String line2 = "c2";
        String result = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += line1;
            } else {
                result += line2;
            }
        }
        System.out.println(result);
    }
}
