package Bridge;

public class BMW implements Make{
    @Override
    public void setMake() {
        System.out.println("Это БМВ");
    }
}
