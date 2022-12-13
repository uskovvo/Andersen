package AbstractFactory.Classes;

import AbstractFactory.Interfaces.AirConditioner;
import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Refrigerator;
import AbstractFactory.Interfaces.WashMachine;

public class LGFactory implements Factory {
    @Override
    public Refrigerator getRefrigerator() {
        return new LGRefrigerator();
    }

    @Override
    public WashMachine getWashMachine() {
        return new LGWashMachine();
    }

    @Override
    public AirConditioner getAirConditioner() {
        return new LGAirConditioner();
    }
}
