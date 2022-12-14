package Decorator;

public class ParadoxSystem implements TurnOnSignaling{

    //for Command pattern
    public void army(){
        System.out.println("Объект под охраной");
    }

    //for Command pattern
    public void disarm(){
        System.out.println("Объект снят с охраны");
    }

    @Override
    public void turnOnSign() {
        System.out.println("При тревоге я включаю сирену!!!");
    }
}
