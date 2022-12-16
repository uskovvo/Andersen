package Bridge;

public abstract class Car {
    public Make make;

    public Car(Make make) {
        this.make = make;
    }

    abstract void showType();
    public void showDetails(){
        showType();
        make.setMake();
    }
}
