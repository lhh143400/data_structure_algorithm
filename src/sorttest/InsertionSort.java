package sorttest;

import java.util.Arrays;

/**
 * 描述：插入排序
 *
 * @author lhh
 * @Date 2020/11/2 20:42
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{8, 6, 2, 3, 1, 5, 7, 4};
        InsertionSort.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int after = array[i + 1];
            int before = i;
            while (before >= 0 && after < array[before]) {
                array[before + 1] = array[before];
                before--;
            }
            array[before+1] = after;
        }
    }

}
