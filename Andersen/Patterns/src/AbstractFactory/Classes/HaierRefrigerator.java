package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Refrigerator;

public class HaierRefrigerator implements Refrigerator {
    @Override
    public void freezingFood() {
        System.out.println("Ваши продукты будт свежими даже через месяц");
    }
}
