package Mediator;

public class ConcreteMediator extends MediatorClass {

    private Friend1 friend1;
    private Friend2 friend2;

    public void setColleague1(Friend1 friend) {
        this.friend1 = friend;
    }

    public void setColleague2(Friend2 friend) {
        this.friend2 = friend;
    }

    @Override
    public void send(String message, Friend sender) {
        if (sender.equals(friend1)) {
            friend2.notify(message);
        } else {
            friend1.notify(message);
        }
    }
}
