/**
 * Задание №3
 * Напишите метод, который принимает на вход строку (String) и
 * определяет является ли строка палиндромом (возвращает
 * boolean значение).
 * Решение от преподавателя
 */

package GB.Seminar_2.CW1;

public class Task6 {
    public static void main(String[] args) {
        String stroka = "qwe eWQ".replaceAll("\\s", "").toLowerCase();
        if (stroka.equals(new StringBuilder(stroka).reverse().toString())) {
            System.out.println("палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
