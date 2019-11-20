import java.util.Arrays;
import java.util.Random;

/**
 * Created by rene on 2019/11/10.
 */
public class SortChecker {

    public static int[] generateArr(){
        int length = 100000;
        int[] arr = new int[length];

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(length);
        }
        return arr;
    }


    public static void isValidate(int[] originalArr, int[] sortArr){
        if(originalArr.length != sortArr.length){
            System.out.println("is Wrong");
        }
        Arrays.sort(originalArr);
        boolean isValid = true;
        for(int i =0 ; i<originalArr.length; i++){
            if(originalArr[i] != sortArr[i]){
                System.out.println("is Wrong");
                return;
            }
        }
    }

    public static void stressTest(int[] originalArr, int[] sortArr, int validateTimes){
        for(int i = 0; i<validateTimes;i++){
            isValidate(originalArr, sortArr);
        }
    }
}
