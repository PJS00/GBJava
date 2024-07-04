/**
 * Задание №1
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая
 * состоит из чередующихся символов c1 и c2, начиная с c1.
 */

package GB.Seminar_2.CW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String line1 = "c1";
        String line2 = "c2";
        System.out.println(getStrOfChars(n, line1, line2));
    }

    private static String getStrOfChars(int n, String c1, String c2) throws Exception {
        if (n <= 0 || n % 2 == 1) {
            throw new Exception("Невалидное значение N");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}