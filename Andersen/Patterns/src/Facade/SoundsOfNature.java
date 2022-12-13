package Facade;

import Delegate.Bird;
import Delegate.Fly;

public class SoundsOfNature {

    private Bird bird;
    private Fly fly;

    public SoundsOfNature(Bird bird, Fly fly) {
        this.bird = bird;
        this.fly = fly;
    }

    public void sounds(){
        bird.tweet();
        fly.buzz();
    }
}
