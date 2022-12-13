import AbstractFactory.Classes.HaierFactory;
import AbstractFactory.Classes.LGFactory;
import AbstractFactory.Interfaces.AirConditioner;
import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Refrigerator;
import AbstractFactory.Interfaces.WashMachine;
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
//        patternDelegate();
//        patternFacade();
//        patternFactory();
        patternAbstractFactory();
    }

    //TODO: Delegate pattern
    public static void patternDelegate() {
        Bird bird = new Bird(new CanFly());
        Fly fly = new Fly();

        bird.myName();
        bird.takeOff();
        bird.flying();

        fly.myName();
        fly.flying();
        fly.landed();
    }

    //TODO: Facade pattern
    public static void patternFacade() {
        Bird bird = new Bird(new CanFly());
        Fly fly = new Fly();
        SoundsOfNature soundsOfNature = new SoundsOfNature(bird, fly);
        soundsOfNature.sounds();
    }

    //TODO: Factory pattern
    public static void patternFactory() {
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

    //TODO: Abstract Factory pattern
    private static void patternAbstractFactory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Чья техника вас интересует?\n" +
                        "Если LG, нажмите: \"1\"\n" +
                        "Если Haier, нажмите: \"2\" : ");
        String str = scanner.nextLine();

        Factory factory = getTechnology(str);
        Refrigerator ref = factory.getRefrigerator();
        WashMachine wash = factory.getWashMachine();
        AirConditioner air = factory.getAirConditioner();

        ref.freezingFood();
        wash.drying();
        air.cooling();
    }

    private static Factory getTechnology(String str) {
        if (str.equals("1")) {
            return new LGFactory();
        } else if (str.equals("2")) {
            return new HaierFactory();
        }
        return null;
    }
}
