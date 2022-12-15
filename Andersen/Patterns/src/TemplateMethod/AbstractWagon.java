package TemplateMethod;

public abstract class AbstractWagon {

    public void template(){
        System.out.print("Запрягают лошадь ");
        System.out.print("садяться ");
        howRide();
        System.out.println("и едут");
    }

    abstract void howRide();
}
