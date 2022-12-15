package Mediator;

public class Friend2 extends Friend {

    public Friend2(MediatorClass mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Friend2: " + message);
    }
}
