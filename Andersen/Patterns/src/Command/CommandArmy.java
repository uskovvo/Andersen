package Command;

import Decorator.ParadoxSystem;

public class CommandArmy extends AbstractS implements Command{

    public CommandArmy(ParadoxSystem paradoxSystem) {
        super(paradoxSystem);
    }

    @Override
    public void execute() {
        super.paradoxSystem.army();
    }
}
