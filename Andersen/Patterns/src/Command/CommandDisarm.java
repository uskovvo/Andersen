package Command;

import Decorator.ParadoxSystem;

public class CommandDisarm extends AbstractS{

    public CommandDisarm(ParadoxSystem paradoxSystem) {
        super(paradoxSystem);
    }

    @Override
    public void execute() {
        super.paradoxSystem.disarm();
    }
}
