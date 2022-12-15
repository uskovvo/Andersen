package Strategy;

import java.util.Arrays;

public class SelectionSort implements Sorting{
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка выборками");
        System.out.println("до: \t" + Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            for(int a = i + 1; a < arr.length; a++){
                if(arr[a] < arr[i]){
                    int tmp = arr[a];
                    arr[a] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println("после: \t" + Arrays.toString(arr));
    }
}
