package State;

public class DeviceContext implements Action{

    private Action action;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public void doAction() {
        this.action.doAction();
    }
}
