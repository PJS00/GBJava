/**
 * Дан массив целых чисел. Верно ли, что массив является симметричным.
 */

package GB.Seminar_1.CW1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        if (isSymmetry(arr)) {
            System.out.println("симметричный");
        } else {
            System.out.println("не симметричный");
        }

        System.out.println("Массив выглядит так: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    private static boolean isSymmetry(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

// Решение от преподавателя
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введи размер массива:");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Введи значения массива:");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        isSimmetr(arr);
//
//        System.out.println("Массив выглядит так:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf(" %d , ", arr[i]);
//        }
//
//    }
//
//    private static void isSimmetr(int[] arr) {
//        for (int i = 0; i < arr.length / 2; i++) {
//            if (arr[i] != arr[arr.length - 1 - i]) {
//                System.out.println("Не симметричный");
//                return;
//            }
//        }
//        System.out.println("Cимметричный");
//    }
//}
