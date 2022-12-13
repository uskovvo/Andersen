public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird(new CanFly());
        Fly fly = new Fly();

        bird.takeOff();
        bird.flying();

        fly.flying();
        fly.landed();
    }
}
