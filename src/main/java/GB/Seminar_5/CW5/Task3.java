/**
 * Задание №2
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */
package GB.Seminar_5.CW5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class Task3 {
//    public static void main(String[] args) {
//        String str = "[a+(1*3)";
//        LinkedList<Integer> values = new LinkedList<Integer>(getMapStaples(str).values());
//        int sumValues = 0;
//        for (int i = 0; i < values.size(); i++) {
//            sumValues+=values.get(i);
//        }
//        if (sumValues % 2 == 0) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//    }
//    public static HashMap getMapStaples (String str) {
//        HashMap mapStr = new HashMap<>();
//        String[] arrStr = str.split("");
//        int count = 0;
//        for (int i = 0; i < arrStr.length; i++) {
//            switch (arrStr[i]) {
//                case "[":
//                case "(":
//                case "<":
//                case "{":
//                case "]":
//                case ")":
//                case ">":
//                case "}":
//                    mapStr.put(arrStr[i], count+1);
//            }
//        }
//        return mapStr;
//    }
//}

    // второй вариант решения
    public static void main(String[] args) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put('(', ')');
        pair.put('[', ']');
        pair.put('{', '}');
        pair.put('<', '>');
        Stack<Character> lifo = new Stack<>();
        String srs = "{a+]}{(d*3)}";
        System.out.println(conditionPairs(srs, pair, lifo));


    }

    private static boolean conditionPairs(String srs, Map<Character, Character> pair, Stack<Character> lifo) {
        for (char c : srs.toCharArray()) {
            if (pair.containsKey(c)) {
                lifo.push(c);
            } else if (pair.containsValue(c)) {
                if (lifo.isEmpty() || pair.get(lifo.pop()) != c) {
                    return false;
                }

            }
        }
        return lifo.isEmpty();
    }
}
