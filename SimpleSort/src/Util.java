/**
 * Created by rene on 2019/11/10.
 */
public class Util {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void print(int[] arr){
        System.out.println("-------------");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("-------------");
    }

    static void println(String str){
        System.out.println(str);
    }
}
