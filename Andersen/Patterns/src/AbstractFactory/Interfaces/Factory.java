package AbstractFactory.Interfaces;

public interface Factory {
    Refrigerator getRefrigerator();
    WashMachine getWashMachine();
    AirConditioner getAirConditioner();
}
