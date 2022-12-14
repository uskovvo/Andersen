package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Functions;
import AbstractFactory.Interfaces.Refrigerator;

public class HaierRefrigerator implements
        Refrigerator, //Abstract factory
        Functions //for Composite
{
    @Override //Abstract factory
    public void freezingFood() {
        System.out.println("Ваши продукты будт свежими даже через месяц");
    }


    //for Composite
    @Override
    public void turnOn() {
        System.out.println("Дверь открылась, включаю свет");
    }
}
