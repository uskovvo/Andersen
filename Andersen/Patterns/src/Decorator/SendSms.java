package Decorator;

public class SendSms extends Decorator{

    public SendSms(TurnOnSignaling turnOnSignaling) {
        super(turnOnSignaling);
    }

    @Override
    public void turnOnSign() {
        super.turnOnSign();
        System.out.println("Теперь можно и смс отправить хоязину");
    }
}
