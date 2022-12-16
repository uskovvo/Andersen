package SingletonPattern;

public class Singleton {

    private static int counter = 0;
    private static volatile Singleton instance;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}
