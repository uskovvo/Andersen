package AbstractFactory.Interfaces;

//Abstract factory
public interface Factory {
    Refrigerator getRefrigerator();
    WashMachine getWashMachine();
    AirConditioner getAirConditioner();
}
