package Strategy;

public class Client {
    Sorting sorting;

    public void setStrategy(Sorting sorting) {
        this.sorting = sorting;
    }

    public void executeStrategy(int[] arr) {
        sorting.sort(arr);

    }
}