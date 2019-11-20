/**
 * 希尔排序
 *
 * Created by rene on 2019/11/10.
 */
public class ShellSort {

    public static void sort(int[] arr){
        for(int gap = arr.length/2;gap>0;gap = gap/2) {
            for(int i=gap; i<arr.length; i+=gap) {
                for (int j = i; j >0; j-=gap) {
                    if (arr[j] < arr[j - 1]) {
                        Util.swap(arr, j, j - 1);
                    }
                }
            }
        }
    }

    public static void upgradeSort(int[] arr){
        int h = 1;
        while(h <= arr.length/3){
            h = h*3 + 1;
        }

        for(int gap = h;gap>0;gap = (gap-1)/3) {
            for(int i=gap; i<arr.length; i+=gap) {
                for (int j = i; j >0; j-=gap) {
                    if (arr[j] < arr[j - 1]) {
                        Util.swap(arr, j, j - 1);
                    }
                }
            }
        }
    }
}
