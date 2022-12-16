package Bridge;

public class Sedan extends Car{
    public Sedan(Make make) {
        super(make);
    }

    @Override
    public void showType() {
        System.out.println("Это седан");
    }
}
