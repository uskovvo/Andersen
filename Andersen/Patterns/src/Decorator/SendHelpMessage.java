package Decorator;

public class SendHelpMessage extends Decorator{

    public SendHelpMessage(TurnOnSignaling turnOnSignaling) {
        super(turnOnSignaling);
    }

    @Override
    public void turnOnSign() {
        super.turnOnSign();
        super.turnSomethingNew();
        System.out.println("Теперь могу отправить сообщение полиции");
    }
}
