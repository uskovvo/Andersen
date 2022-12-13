package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Refrigerator;

public class LGRefrigerator implements Refrigerator {
    @Override
    public void freezingFood() {
        System.out.println("Ваши продукты еще долго будут свежими");
    }
}
