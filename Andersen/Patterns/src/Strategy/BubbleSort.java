package Strategy;

import java.util.Arrays;

public class BubbleSort implements Sorting{
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка пузырьком");
        System.out.println("до: \t" + Arrays.toString(arr));
        for(int i = arr.length - 1; i >= 0; i--){
            for(int s = 0; s < i; s++){
                if(arr[s] > arr[s + 1]){
                    int tmp = arr[s];
                    arr[s] = arr[s + 1];
                    arr[s + 1] = tmp;
                }
            }
        }
        System.out.println("после: \t" + Arrays.toString(arr));

    }
}
