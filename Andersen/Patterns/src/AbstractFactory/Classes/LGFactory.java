package AbstractFactory.Classes;

import AbstractFactory.Interfaces.AirConditioner;
import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Refrigerator;
import AbstractFactory.Interfaces.WashMachine;

public class LGFactory implements Factory {

    public LGFactory(){
        System.out.println("Ваш выбор LG");
    }

    @Override //Abstract factory
    public Refrigerator getRefrigerator() {
        return new LGRefrigerator();
    }

    @Override //Abstract factory
    public WashMachine getWashMachine() {
        return new LGWashMachine();
    }

    @Override //Abstract factory
    public AirConditioner getAirConditioner() {
        return new LGAirConditioner();
    }
}
