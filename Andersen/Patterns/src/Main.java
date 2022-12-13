import Delegate.Bird;
import Delegate.CanFly;
import Delegate.Fly;
import Facade.SoundsOfNature;

public class Main {
    public static void main(String[] args) {

        // Delegate start
        Bird bird = new Bird(new CanFly());
        Fly fly = new Fly();

        bird.takeOff();
        bird.flying();

        fly.flying();
        fly.landed();
        // Delegate finish

        // Facade start
        SoundsOfNature soundsOfNature = new SoundsOfNature(bird, fly);
        soundsOfNature.sounds();
    }
}
