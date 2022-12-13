package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Functions;
import AbstractFactory.Interfaces.Refrigerator;

public class HaierRefrigerator implements Refrigerator, Functions {
    @Override
    public void freezingFood() {
        System.out.println("Ваши продукты будт свежими даже через месяц");
    }

    @Override
    public void turnOn() {
        System.out.println("Дверь открылась, включаю свет");
    }
}
