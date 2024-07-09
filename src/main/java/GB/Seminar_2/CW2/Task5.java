/**
 * Задание №3
 * Напишите метод, который принимает на вход строку (String) и
 * определяет является ли строка палиндромом (возвращает
 * boolean значение).
 */

package GB.Seminar_2.CW2;

public class Task5 {
    public static void main(String[] args) {
        String input = "123454321";
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
