package Adapter;

import java.util.ArrayList;
import java.util.List;

public class ListOfOrderedNum {

    public void getListOrderedNum(){
        List<Integer> orderedList = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            orderedList.add(i);
        }
        orderedList.forEach(System.out::println);
    }
}
