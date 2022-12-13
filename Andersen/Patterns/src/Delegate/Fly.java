package Delegate;

public class Fly {

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
}
