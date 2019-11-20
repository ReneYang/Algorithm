/**
 * 归并排序
 * Created by rene on 2019/11/13.
 */
public class MergeSort {

    public static void sort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    static void mergeSort(int[] arr, int left, int right){

        if(left >= right){return;}
        int mid = left+(right-left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, right, mid);
    }

    static void merge(int[] arr, int left, int right, int mid){
        int i = left;
        int j = mid+1;
        int[] temp = new int[right-left+1];
        int k = 0;
        while(i <= mid && j <= right){
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while(i<= mid){
            temp[k++] = arr[i++];
        }
        while(j<= right){
            temp[k++] = arr[j++];
        }

        for(int index = 0; index<temp.length; index++){
            arr[left+index] = temp[index];
        }


    }
}
