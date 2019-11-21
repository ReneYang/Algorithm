/**
 * 计数排序
 * Created by rene on 2019/11/21.
 */
public class CountSort {
    public static void sort(int[] arr){
        countSort(arr);
    }

    static void countSort(int[] arr){
        int[] count = new int[10];
        int[] sort = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i = 0; i<count.length; i++){
            while(count[i]-- > 0 ){
                sort[j++] = i;
            }
        }


        for(int i=0; i<sort.length;i++){
            arr[i] = sort[i];
        }
    }
}
