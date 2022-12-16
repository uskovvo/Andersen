package Bridge;

public class Toyota implements Make{
    @Override
    public void setMake() {
        System.out.println("Тойота");
    }
}
