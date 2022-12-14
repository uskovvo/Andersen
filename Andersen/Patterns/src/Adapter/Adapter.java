package Adapter;

public class Adapter extends ListOfOrderedNum implements ListOfRandomNum{

    @Override
    public void getListOfRandomNumbers() {
        getListOrderedNum();
    }
}
