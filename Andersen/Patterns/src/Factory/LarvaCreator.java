package Factory;

import Delegate.Fly;

public class LarvaCreator implements EggCreator{

    @Override
    public CreateEgg eggCreator() {
        return new Fly();
    }
}
