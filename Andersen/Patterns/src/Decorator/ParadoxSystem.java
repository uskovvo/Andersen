package Decorator;

public class ParadoxSystem implements TurnOnSignaling{

    @Override
    public void turnOnSign() {
        System.out.println("При тревоге я включаю сирену!!!");
    }
}
