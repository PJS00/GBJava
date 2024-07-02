/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n).
 * Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
 * Если число n < 1 (ненатуральное) метод должен вернуть -1.
 * Пример
 * n = 4 -> 10
 * n = 5 -> 15
 */

package GB.Seminar_1.HW1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(countNTriangle(4));
    }

    public static int countNTriangle(int n) {
        int result = 0;
        for (int i = 1; i < n + 1; i++) {
            result += i;
        }
        return result;
    }
}
