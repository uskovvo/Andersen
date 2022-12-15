package TemplateMethod;

public class Cart extends AbstractWagon{

    @Override
    void howRide() {
        System.out.print("на тележку ");
    }
}
