package GB.Seminar_4.HW4;


import java.util.ArrayDeque;
import java.util.Deque;


public class Calculator {
    public Deque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        double result = 0;
        if (op == '<') {
            resultsStack.removeLast();
            return resultsStack.peekLast();
        }
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        }
        resultsStack.addLast(result);
        return result;
    }
}
