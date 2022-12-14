package Decorator;

public class ParadoxSystem implements TurnOnSignaling{

    public void army(){
        System.out.println("Объект под охраной");
    }

    public void disarm(){
        System.out.println("Объект снят с охраны");
    }

    @Override
    public void turnOnSign() {
        System.out.println("При тревоге я включаю сирену!!!");
    }
}
