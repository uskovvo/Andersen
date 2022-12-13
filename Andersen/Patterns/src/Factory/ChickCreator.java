package Factory;

import Delegate.Bird;
import Delegate.CanFly;

public class ChickCreator implements EggCreator{

    @Override
    public CreateEgg eggCreator() {
        return new Bird(new CanFly());
    }
}
