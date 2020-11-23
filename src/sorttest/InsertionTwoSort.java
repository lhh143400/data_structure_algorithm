package sorttest;

/**
 * 描述：二分查找
 *
 * @author lhh
 * @Date 2020/11/4 16:42
 */
public class InsertionTwoSort {
    public static void main(String[] args) {
        int[] nums = {-5, 0, 1, 2, 3, 5, 7, 9, 10, 15, 20, 28, 50, 56};
        System.out.println(binarySearch(nums, 56));
    }

    /**
     * 二分查找key值对应的下标
     * @param source 输入的源数组 ，请保证为一个有序数组
     * @param key 需要查找的值
     * @return 正数为查找到的坐标，-1表示没有查到
     */
    public static int binarySearch(int[] source, int key) {
        int start=0;
        int end=source.length-1;
        while (start<=end){
            int mid=(end+start)>>>1;
            if(source[mid]<key){
                start=mid+1;
            }else if(source[mid]>key){
                end=mid-1;
            }else {
                return mid;
            }
        }
       return -1;
    }
}