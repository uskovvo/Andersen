package SingletonPattern;

public class Runn implements Runnable{

    @Override
    public void run() {
        Singleton.getInstance();
    }
}
