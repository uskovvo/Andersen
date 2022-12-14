package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Functions;
import AbstractFactory.Interfaces.WashMachine;

public class HaierWashMachine implements
        WashMachine, //Abstract factory
        Functions //for Composite
{

    @Override //Abstract factory
    public void washing() {
        System.out.println("Постирано бережно!!!");
    }

    @Override //Abstract factory
    public void ironing() {
        System.out.println("Выглажено и можно сразу одевать");
    }

    @Override //Abstract factory
    public void drying() {
        System.out.println("Уже все сухо!!!");
    }


    //for Composite
    @Override
    public void turnOn() {
        System.out.println("Включаю бесшумный режим");
    }
}
