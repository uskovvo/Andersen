package Decorator;

import ObserverPattern.Observed;
import ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class ParadoxSystem implements TurnOnSignaling,
        Observed //for Observer pattern
{
    private boolean army; //for Observer pattern
    private boolean alarm; //for Observer pattern
    private List<Observer> list = new ArrayList<>(); //for Observer pattern

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

    //for Observer pattern
    @Override
    public void addObserver(Observer o) {
        list.add(o);
    }

    //for Observer pattern
    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    //for Observer pattern
    @Override
    public void notifyObservers() {
        list.forEach(o -> o.handleEvent(army, alarm));
    }

    //for Observer pattern
    public void setStatusSys(boolean army, boolean alarm){
        this.army = army;
        this.alarm = alarm;
        notifyObservers();
    }
}
