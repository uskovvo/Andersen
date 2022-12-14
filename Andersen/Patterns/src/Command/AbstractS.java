package Command;

import Decorator.ParadoxSystem;

abstract class AbstractS implements Command{

    public ParadoxSystem paradoxSystem;

    public AbstractS(ParadoxSystem paradoxSystem) {
        this.paradoxSystem = paradoxSystem;
    }
}
