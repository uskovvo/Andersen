package Delegate;

public class Bird {

    private CanFly canFly;

    public Bird(CanFly canFly) {
        this.canFly = canFly;
    }

    public void takeOff(){
        canFly.takeOff();
    }

    public void flying(){
        canFly.flying();
    }

    public void tweet(){
        System.out.println("Я птица и я чирикаю");
    }
}
