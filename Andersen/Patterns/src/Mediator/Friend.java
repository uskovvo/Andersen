package Mediator;

public abstract class Friend {

    protected MediatorClass mediator;

    public Friend(MediatorClass mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}
