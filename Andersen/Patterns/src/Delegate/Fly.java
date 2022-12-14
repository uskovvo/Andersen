package Delegate;

import Factory.CreateEgg;

public class Fly implements CreateEgg {

    CanFly canFly = new CanFly();

    public void buzz(){
        System.out.println("Я муха и я жжужу");
    }

    public void landed(){
        canFly.landed();
    }

    public void flying(){
        canFly.flying();
    }

    //Factory
    @Override
    public void createEgg() {
        System.out.println("Я откложила яйца и через неделю жду личинок");
    }

    public void myName() {
        System.out.println("Я муха");
    }
}
