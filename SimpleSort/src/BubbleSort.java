/**
 * 冒泡排序
 * Created by rene on 2019/11/10.
 */
public class BubbleSort {

    public static void sort(int[] arr){
        for(int i = arr.length; i > 0; i--){
            for(int j=0;j< i-1;j++){
                if(arr[j] > arr[j+1]){
                    Util.swap(arr, j, j+1);
                }
            }
        }
    }

    public static void upgradeSort(int[] arr){
        boolean isSorted = true;
        for(int i=arr.length; i > 0; i--){
            for (int j = 0; j<i-1;j++){
                if (arr[j] > arr[j+1]){
                    Util.swap(arr, j, j+1);
                    isSorted = false;
                }
            }
            if(isSorted) {
                return;
            }
        }
    }
}
