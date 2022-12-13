package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Refrigerator;

public class LGRefrigerator implements Refrigerator {
    private String name;
    private String type;
    private int height;

    @Override
    public void freezingFood() {
        System.out.println("Ваши продукты еще долго будут свежими");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Холодильник: \n" +
                " название: " + name + "\n" +
                " тип: " + type + "\n" +
                " высота: " + height;
    }
}
