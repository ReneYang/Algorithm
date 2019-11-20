/**
 * 插入排序
 * Created by rene on 2019/11/10.
 */
public class InsertionSort {

    public static void sort(int[] arr){
        for(int i=1; i<arr.length; i++) {
            for (int j = i; j >0; j--) {
                if (arr[j] < arr[j - 1]) {
                    Util.swap(arr, j, j - 1);
                }
            }
        }
    }
}
