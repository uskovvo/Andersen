package Command;

public class Keyboard {
    Command army;
    Command disarm;

    public Keyboard(Command army, Command disarm) {
        this.army = army;
        this.disarm = disarm;
    }

    public void armySign(){
        army.execute();
    }

    public void disarmSign(){
        disarm.execute();
    }
}
