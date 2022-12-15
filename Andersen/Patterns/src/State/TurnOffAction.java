package State;

public class TurnOffAction implements Action{
    @Override
    public void doAction() {
        System.out.println("Выключил!!!");
    }
}
