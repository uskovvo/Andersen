package Delegate;

import Factory.CreateEgg;

public class Bird implements
        CreateEgg  //Factory
{

    private CanFly canFly;

    public Bird(CanFly canFly) {
        this.canFly = canFly;
    }

    public void myName(){
        System.out.println("Я птица");
    }

    public void takeOff(){
        canFly.takeOff();
    }

    public void flying(){
        canFly.flying();
    }

    public void tweet(){
        System.out.println("Я чирикаю");
    }

    //Factory
    @Override
    public void createEgg() {
        System.out.println("Я откладываю яйцо и жду через месяц и птенцов");
    }
}
