package AbstractFactory.Classes;

import AbstractFactory.Interfaces.WashMachine;

public class LGWashMachine implements WashMachine {
    @Override
    public void washing() {
        System.out.println("Стираю очень чисто");
    }

    @Override
    public void ironing() {
        System.out.println("Ваша одежда почти готова");
    }

    @Override
    public void drying() {
        System.out.println("Одежда почти сухая");
    }
}
