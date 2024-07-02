// Given an integer number n,
// return the difference between
// the product of its digits and
// the sum of its digits.
//Example 1:
//Input: n = 234
//Output: 15
//Explanation:
//Product of digits = 2 * 3 * 4 = 24
//Sum of digits = 2 + 3 + 4 = 9
//Result = 24 - 9 = 15
//
//Example 2:
//Input: n = 4421
//Output: 21
//Explanation:
//Product of digits = 4 * 4 * 2 * 1 = 32
//Sum of digits = 4 + 4 + 2 + 1 = 11
//Result = 32 - 11 = 21
//
//Constraints:
//        1 <= n <= 10^5

/**
 *
 */

package GB.Seminar_1.CW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = getPrMinusSum(n);
        System.out.println("result = " + result);
    }

    /**
     * @apiNote  доп. описание
     * @param n начальное значение
     * @return произведение минус сумма
     */
    private static int getPrMinusSum(int n) {
        int sum = 0;
        int pr = 1;

        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}
