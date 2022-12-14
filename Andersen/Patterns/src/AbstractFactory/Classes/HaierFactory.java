package AbstractFactory.Classes;

import AbstractFactory.Interfaces.AirConditioner;
import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Refrigerator;
import AbstractFactory.Interfaces.WashMachine;

//Abstract factory
public class HaierFactory implements Factory {

    public HaierFactory(){
        System.out.println("Ваш выбор Haier");
    }

    @Override
    public Refrigerator getRefrigerator() {
        return new HaierRefrigerator();
    }

    @Override
    public WashMachine getWashMachine() {
        return new HaierWashMachine();
    }

    @Override
    public AirConditioner getAirConditioner() {
        return new HaierAirConditioner();
    }
}
