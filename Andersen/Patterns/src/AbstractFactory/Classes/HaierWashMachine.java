package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Functions;
import AbstractFactory.Interfaces.WashMachine;

public class HaierWashMachine implements WashMachine, Functions {
    @Override
    public void washing() {
        System.out.println("Постирано бережно!!!");
    }

    @Override
    public void ironing() {
        System.out.println("Выглажено и можно сразу одевать");
    }

    @Override
    public void drying() {
        System.out.println("Уже все сухо!!!");
    }

    @Override
    public void turnOn() {
        System.out.println("Включаю бесшумный режим");
    }
}
