public class Bird {

    CanFly canFly;

    public Bird(CanFly canFly) {
        this.canFly = canFly;
    }

    public void takeOff(){
        canFly.takeOff();
    }

    public void flying(){
        canFly.flying();
    }
}
