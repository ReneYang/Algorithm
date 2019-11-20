/**
 * 快速排序
 * Created by rene on 2019/11/20.
 */
public class QuickSort {
    public static void sort(int[] arr){
        quickSort(arr, 0,  arr.length-1);
    }

    static void quickSort(int[] arr, int left, int right){
        int basePos = left;
        int i = left;
        int j = right;
        if(left>right){
            return;
        }
        while(i != j){
            while(arr[j] >= arr[left] && j > i){
                j--;
            }

            while(arr[i] <= arr[left] && i < j){
                i++;
            }
            if(i<j){
                Util.swap(arr, i, j);
            }

        }
        Util.swap(arr, basePos, i);

        quickSort(arr, left, i-1);
        quickSort(arr, i+1, right);
    }
}
