import AbstractFactory.Classes.HaierFactory;
import AbstractFactory.Classes.LGFactory;
import AbstractFactory.Classes.LGRefrigerator;
import AbstractFactory.Interfaces.AirConditioner;
import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Refrigerator;
import AbstractFactory.Interfaces.WashMachine;
import Builder.RefWithNoFrost;
import Builder.RefWithoutNoFrost;
import Builder.User;
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

    static Bird bird;
    static Fly fly;

    public static void main(String[] args) {
//        patternDelegate(bird, fly);
//        patternFacade(bird, fly);
//        patternFactory();
//        patternAbstractFactory();
//        patternBuilder();
        patternPrototype();
    }

    //TODO: Delegate pattern
    public static void patternDelegate(Bird bird, Fly fly) {
        bird = new Bird(new CanFly());
        fly = new Fly();

        bird.myName();
        bird.takeOff();
        bird.flying();

        fly.myName();
        fly.flying();
        fly.landed();
    }

    //TODO: Facade pattern
    public static void patternFacade(Bird bird, Fly fly) {
        bird = new Bird(new CanFly());
        fly = new Fly();
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
    public static void patternAbstractFactory() {
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

    public static Factory getTechnology(String str) {
        if (str.equals("1")) {
            return new LGFactory();
        } else if (str.equals("2")) {
            return new HaierFactory();
        }
        return null;
    }

    //TODO: Builder pattern
    public static void patternBuilder() {
        User user = new User();

        user.setRefBuilder(new RefWithNoFrost());
        LGRefrigerator lgRefrigerator = user.chooseModel();
        System.out.println(lgRefrigerator + "\n");

        user.setRefBuilder(new RefWithoutNoFrost());
        LGRefrigerator lgRefrigerator1 = user.chooseModel();
        System.out.println(lgRefrigerator1);
    }

    //TODO: Prototype pattern
    public static void patternPrototype(){
        User user = new User("Катя", 19);
        System.out.println(user + "\nХэшкод этого юзера: " + user.hashCode());
        User clone = user.clone();

        System.out.println(clone + "\nХэшкод этого юзера: " + clone.hashCode());
    }
}
