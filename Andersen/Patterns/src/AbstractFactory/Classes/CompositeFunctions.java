package AbstractFactory.Classes;

import AbstractFactory.Interfaces.Functions;

import java.util.ArrayList;
import java.util.List;

//for Composite
public class CompositeFunctions implements Functions {

    private List<Functions> list = new ArrayList<>();

    @Override
    public void turnOn() {
        list.forEach(Functions::turnOn);
    }

    public void add(Functions functions){
        list.add(functions);
    }

    public void remove(Functions functions){
        list.remove(functions);
    }
}
