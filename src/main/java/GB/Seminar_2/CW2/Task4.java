/**
 * Задание №2
 * Напишите метод, который сжимает строку.
 * Пример: вход aaaabbbcdd.
 * выход abcd
 */

package GB.Seminar_2.CW2;

public class Task4 {
    public static void main(String[] args) {
        String input = "aaaabbbcddeeefgg";
        StringBuilder result = getResString(input);
        System.out.println(result);
    }

    private static StringBuilder getResString(String input) {
        StringBuilder result = new StringBuilder();
        char prev = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current != prev) {
                result.append(prev);
            }
            prev = current;
            if (i == input.length() - 1) {
                result.append(prev);
            }
        }
        return result;
    }
}
