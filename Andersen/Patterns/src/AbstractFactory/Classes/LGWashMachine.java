package AbstractFactory.Classes;

import AbstractFactory.Interfaces.WashMachine;

public class LGWashMachine implements WashMachine {
    @Override //Abstract factory
    public void washing() {
        System.out.println("Стираю очень чисто");
    }

    @Override //Abstract factory
    public void ironing() {
        System.out.println("Ваша одежда почти готова");
    }

    @Override //Abstract factory
    public void drying() {
        System.out.println("Одежда почти сухая");
    }
}
