package Adapter;

import java.util.ArrayList;
import java.util.List;

public interface ListOfRandomNum {

    default void getListOfRandomNumbers(){
        List<Integer> randomList = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            int a = (int) Math.round(Math.random());
            randomList.add(a);
        }
        randomList.forEach(System.out::println);
    }
}
