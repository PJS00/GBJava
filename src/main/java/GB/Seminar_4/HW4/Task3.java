/**
 * В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
 * Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
 * calculate('+', 3, 7)
 * calculate('+', 4, 7)
 * calculate('<', 0, 0)
 * // 10.0
 * // 11.0
 * // 10.0
 * calculate('*', 3, 2)
 * calculate('-', 7, 4)
 * calculate('<', 0, 0)
 * // 6.0
 * // 3.0
 * // 6.0
 */

package GB.Seminar_4.HW4;

public class Task3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        a = 3;
        op = '+';
        b = 7;
        c = 4;
        op2 = '+';
        d = 7;
        undo = '<';

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
