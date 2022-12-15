package Mediator;

public class Friend1 extends Friend {

    public Friend1(MediatorClass mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Friend1: " + message);
    }
}
