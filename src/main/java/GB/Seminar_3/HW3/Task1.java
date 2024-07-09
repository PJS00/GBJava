/**
 * Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
 * Пример
 * a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */

package GB.Seminar_3.HW3;

import java.util.Arrays;

public class Task1 {

    public static int[] mergeSort(int[] src) {
        if (src.length <= 1) return src;
        int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        int[] right = Arrays.copyOfRange(src, left.length, src.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 1, 6, 2, 3, 4};
//        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(mergeSort(a));
        System.out.println(itresume_res);
    }

}
