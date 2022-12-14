package Decorator;

public class Decorator implements TurnOnSignaling{
    public TurnOnSignaling turnOnSignaling;

    public Decorator(TurnOnSignaling turnOnSignaling) {
        this.turnOnSignaling = turnOnSignaling;
    }

    @Override
    public void turnOnSign() {
        turnOnSignaling.turnOnSign();
    }

    public void turnSomethingNew(){
        System.out.println("Могу ударить нарушителей током!");
    }
}
