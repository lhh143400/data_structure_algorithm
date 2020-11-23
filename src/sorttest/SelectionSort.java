package sorttest;

import java.util.Arrays;

/**
 * 描述：选择排序
 *
 * @author lhh
 * @Date 2020/11/2 19:09
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{8,6,2,3,1,5,7,4};
        SelectionSort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int array[]){
      for (int i=0;i<array.length;i++){
          int minIndex=i;
          for(int j=i;j<array.length;j++){
              if(array[j]<array[minIndex]){
                  minIndex=j;
              }
          }

          int temp=array[i];
          array[i]=array[minIndex];
          array[minIndex]=temp;
      }
    }
}
