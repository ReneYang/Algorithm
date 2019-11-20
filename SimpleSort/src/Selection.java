/**
 * 选择排序
 * Created by rene on 2019/11/10.
 */
public class Selection {
    static void originalSelectionSort(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            int index = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            Util.swap(arr, i, index);
        }
    }


    static void upgradeSelectionSort(int[] arr){
        for(int i=0;i < arr.length/2;i++){
            int minPos = i;
            int maxPos = i;
            for(int j = i+1;j<arr.length - i;j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
                maxPos = arr[j] > arr[maxPos] ? j : maxPos;
            }
            Util.swap(arr, i, minPos);

            if(maxPos == i){
                maxPos = minPos;
            }

            if (arr[arr.length-1-i] != arr[maxPos]){
                Util.swap(arr, arr.length - 1 - i, maxPos);
            }

        }
    }
}
