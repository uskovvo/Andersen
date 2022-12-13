import Delegate.Bird;
import Delegate.CanFly;
import Delegate.Fly;
import Facade.SoundsOfNature;
import Factory.ChickCreator;
import Factory.CreateEgg;
import Factory.EggCreator;
import Factory.LarvaCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TODO: Delegate pattern
        Bird bird = new Bird(new CanFly());
        Fly fly = new Fly();

        bird.myName();
        bird.takeOff();
        bird.flying();

        fly.myName();
        fly.flying();
        fly.landed();

        //TODO: Facade pattern
        SoundsOfNature soundsOfNature = new SoundsOfNature(bird, fly);
        soundsOfNature.sounds();

        //TODO: Factory pattern
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Кого вы хотите получить?\n" +
                        "Если птицу, нажмите: \"1\"\n" +
                        "Если муху, нажмите: \"2\": ");
        String str = scanner.nextLine();

        EggCreator eggCreator = getEggCreator(str);
        CreateEgg createEgg = null;
        if (eggCreator != null) {
            createEgg = eggCreator.eggCreator();
        } else {
            System.out.println("Другого не дано)");
        }
        createEgg.createEgg();
    }

    public static EggCreator getEggCreator(String str) {
        if (str.equals("1")) {
            return new ChickCreator();
        } else if (str.equals("2")) {
            return new LarvaCreator();
        }

        return null;
    }
}
