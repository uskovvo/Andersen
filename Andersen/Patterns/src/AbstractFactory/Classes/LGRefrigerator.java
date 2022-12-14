package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Refrigerator;

public class LGRefrigerator implements Refrigerator {
    private String name; //Builder
    private String type; //Builder
    private int height; //Builder

    @Override //Abstract factory
    public void freezingFood() {
        System.out.println("Ваши продукты еще долго будут свежими");
    }

    //Builder
    public void setName(String name) {
        this.name = name;
    }

    //Builder
    public void setType(String type) {
        this.type = type;
    }

    //Builder
    public void setHeight(int height) {
        this.height = height;
    }

    //Builder
    @Override
    public String toString() {
        return "Холодильник: \n" +
                " название: " + name + "\n" +
                " тип: " + type + "\n" +
                " высота: " + height;
    }
}
