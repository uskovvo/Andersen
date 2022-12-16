package Bridge;

public class Hatchback extends Car{
    public Hatchback(Make make) {
        super(make);
    }

    @Override
    public void showType() {
        System.out.println("Это хэтчбэк");
    }
}
