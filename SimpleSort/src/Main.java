import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

//        simpleTest();
        stressTest();
    }

    static void stressTest(){
        for(int i=0;i < 1;i++) {
            int[] originalArr = SortChecker.generateArr();
            int[] sortArr = Arrays.copyOf(originalArr, originalArr.length);
//            Util.print(sortArr);

//            checkOriginalSelectionSort(originalArr, sortArr);
//            checkBubbleSort(sortArr);
//            checkBubbleUpgradeSort(sortArr);

//            InsertionSort.sort(sortArr);
//            ShellSort.sort(sortArr);
            MergeSort.sort(sortArr);
            SortChecker.stressTest(originalArr, sortArr, 10000000);

//            Util.print(sortArr);
        }
        System.out.println("finish");
    }

    public static void simpleTest(){
//        int[] arr = {1,4,3,6,5,2};
//        InsertionSort.sort(arr);
//        ShellSort.sort(arr);

        int[] arr = {2809,
                162,
                462,
                7772,
                2299,
                9936,
                2111,
                3307,
                1567,
                2938};
        MergeSort.sort(arr);
        Util.print(arr);
    }

    static void checkOriginalSelectionSort(int[] sortArr){
        Selection.originalSelectionSort(sortArr);
    }

    static void checkUpgradeSelectionSort(int[] sortArr){
        Selection.upgradeSelectionSort(sortArr);
    }

    static void checkBubbleSort(int[] sortArr){
        BubbleSort.sort(sortArr);
    }

    static void checkBubbleUpgradeSort(int[] sortArr){
        BubbleSort.upgradeSort(sortArr);
    }
}
