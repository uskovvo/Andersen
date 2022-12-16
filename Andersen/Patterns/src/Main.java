import AbstractFactory.Classes.*;
import AbstractFactory.Interfaces.AirConditioner;
import AbstractFactory.Interfaces.Factory;
import AbstractFactory.Interfaces.Refrigerator;
import AbstractFactory.Interfaces.WashMachine;
import Adapter.Adapter;
import Bridge.*;
import Builder.RefWithNoFrost;
import Builder.RefWithoutNoFrost;
import Builder.User;
import ChainOfResponsibility.SomeUser;
import Command.CommandArmy;
import Command.CommandDisarm;
import Command.Keyboard;
import Decorator.*;
import Delegate.Bird;
import Delegate.CanFly;
import Delegate.Fly;
import Facade.SoundsOfNature;
import Factory.ChickCreator;
import Factory.CreateEgg;
import Factory.EggCreator;
import Factory.LarvaCreator;
import Flyweight.Shape;
import Flyweight.ShapeFactory;
import InterpreterPattern.Context;
import InterpreterPattern.Expression;
import IteratorPattern.Tasks;
import IteratorPattern.Iterator;
import Mediator.*;
import Memento.Console;
import ObserverPattern.Human;
import ObserverPattern.Police;
import ProxyPattern.Image;
import ProxyPattern.RealImage;
import SingletonPattern.Runn;
import SingletonPattern.Singleton;
import State.DeviceContext;
import State.TurnOffAction;
import State.TurnOnAction;
import Strategy.*;
import TemplateMethod.AbstractWagon;
import TemplateMethod.Cart;
import TemplateMethod.Coach;
import VisitorPattern.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Bird bird;
    static Fly fly;

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
//        patternDelegate(bird, fly);
//        patternFacade(bird, fly);
//        patternFactory();
//        patternAbstractFactory();
//        patternBuilder();
//        patternPrototype();
//        patternComposite();
//        patternAdapter();
//        patternDecorator();
//        patternCommand();
//        patternChainOfResponsibility();
//        patternMemento();
//        patternMediator();
//        patternObserver();
//        patternState();
//        patternTemplate();
//        patternStrategy();
//        patternVisitor();
//        patternIterator();
//        patternProxy();
//        patternFlyweight();
//        patternSingleton();
//        patternBridge();
        patternInterpreter();
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
    public static void patternPrototype() throws CloneNotSupportedException {
        User user = new User("Катя", 19);
        System.out.println(user + "\nХэшкод этого юзера: " + user.hashCode());

        User clone = user.clone();
        System.out.println(clone + "\nХэшкод этого юзера: " + clone.hashCode());
    }

    //TODO: Composite pattern
    public static void patternComposite(){
        HaierRefrigerator ref1 = new HaierRefrigerator();
        HaierRefrigerator ref2 = new HaierRefrigerator();

        HaierWashMachine wash1 = new HaierWashMachine();
        HaierWashMachine wash2 = new HaierWashMachine();

        CompositeFunctions f1 = new CompositeFunctions();
        CompositeFunctions f2 = new CompositeFunctions();
        CompositeFunctions f3 = new CompositeFunctions();

        f2.add(ref1);
        f2.add(wash2);
        f1.add(wash1);
        f1.add(f2);
        f3.add(ref2);
        f3.add(f1);
        f3.add(ref2);

        f2.turnOn();
    }

    //TODO: Adapter pattern
    public static void patternAdapter(){
        Adapter adapter = new Adapter();
        adapter.getListOfRandomNumbers();
    }

    //TODO: Decorator pattern
    private static void patternDecorator() throws InterruptedException {
        ParadoxSystem sys = new ParadoxSystem();
        TurnOnSignaling f1 = new SendHelpMessage(sys);
        TurnOnSignaling f2 = new SendSms(new SendHelpMessage(sys));
        sys.turnOnSign(); //without decorator

        Thread.sleep(2000);
        f1.turnOnSign(); //with SendHelpMessage

        Thread.sleep(2000);
        f2.turnOnSign(); //with HelpMessage and SendSms
    }

    //TODO: Command pattern
    public static void patternCommand() throws InterruptedException {
        ParadoxSystem p = new ParadoxSystem();
        Keyboard keyboard = new Keyboard(new CommandArmy(p), new CommandDisarm(p));

        System.out.println("Юзер ставит на охраны");
        Thread.sleep(500);
        keyboard.armySign();
        Thread.sleep(1000);
        System.out.println("Юзер снимает с охраны");
        Thread.sleep(500);
        keyboard.disarmSign();
    }

    //TODO: Chain Of Responsibility pattern
    public static void patternChainOfResponsibility(){
        SomeUser someUser = new SomeUser();
    }

    //TODO: Memento pattern
    public static void patternMemento(){
        Console console = new Console();
    }

    //TODO: Mediator pattern
    public static void patternMediator(){
        ConcreteMediator m = new ConcreteMediator();

        Friend1 c1 = new Friend1(m);
        Friend2 c2 = new Friend2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("Привет");
        c2.send("Добрый день");
    }

    //TODO: Observer pattern
    public static void patternObserver(){
        ParadoxSystem p = new ParadoxSystem();
        p.addObserver(new Police());
        p.addObserver(new Human());

        p.setStatusSys(false, false);
    }

    //TODO: State pattern
    public static void patternState(){
        DeviceContext d = new DeviceContext();
        d.setAction(new TurnOnAction());
        d.doAction();
        d.setAction(new TurnOffAction());
        d.doAction();
    }

    //TODO: Template pattern
    public static void patternTemplate(){
        AbstractWagon cart = new Cart();
        AbstractWagon coach = new Coach();

        cart.template();
        coach.template();
    }

    //TODO: Strategy pattern
    public static void patternStrategy(){
        Client client = new Client();
        int[] array = {5,10,20,11,15};
        client.setStrategy(new SelectionSort());
        client.executeStrategy(array);

        int[] arr = {1,9,52,0,14,38};
        client.setStrategy(new BubbleSort());
        client.executeStrategy(arr);

        int[] array1 = {7,6,0,12,15,27,13};
        client.setStrategy(new InsertingSort());
        client.executeStrategy(array1);
    }

    //TODO: Visitor pattern
    public static void patternVisitor(){
        Element el = new CarElement();
        Visitor man = new VisitorMan();
        Visitor woman = new VisitorWoman();

        el.accept(man);
    }

    //TODO: Iterator pattern
    public static void patternIterator(){
        Tasks c = new Tasks();
        Iterator i = c.getIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    //TODO: Proxy pattern
    public static void patternProxy() {
        Image image = new RealImage("файл с картинкой");
        image.display();
    }

    //TODO: Flyweight pattern
    public static void patternFlyweight(){
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> listShapes = new ArrayList<>();

        listShapes.add(shapeFactory.getShape("круг"));
        listShapes.add(shapeFactory.getShape("точка"));
        listShapes.add(shapeFactory.getShape("квадрат"));
        listShapes.add(shapeFactory.getShape("круг"));
        listShapes.add(shapeFactory.getShape("точка"));
        listShapes.add(shapeFactory.getShape("квадрат"));
        listShapes.add(shapeFactory.getShape("точка"));
        listShapes.add(shapeFactory.getShape("точка"));
        listShapes.add(shapeFactory.getShape("квадрат"));
        listShapes.add(shapeFactory.getShape("квадрат"));

        for(Shape s: listShapes){
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 15);
            s.draw(x, y);
        }
    }

    //TODO: Singleton pattern
    public static void patternSingleton() throws InterruptedException {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

        Thread[] t = new Thread[1000];
        for(int i = 0; i < 1000; i++){
            t[i] = new Thread(new Runn());
            t[i].start();
        }

        for(int i = 0; i < 1000; i++){
            t[i].join();
        }
        System.out.println(Singleton.getCounter());
    }

    //TODO: Bridge pattern
    public static void patternBridge(){
        Car car1 = new Hatchback(new Renault());
        Car car2 = new Sedan(new Toyota());
        Car car3 = new Sedan(new Renault());
        Car car4 = new Hatchback(new Toyota());
        Car car5 = new Sedan(new BMW());

        car1.showDetails();
        car2.showDetails();
        car3.showDetails();
        car4.showDetails();
        car5.showDetails();
    }

    public static void patternInterpreter(){
        Context context = new Context();
        Expression e = context.evaluate("25-31+52");
        System.out.println(e.interpret());
    }
}
