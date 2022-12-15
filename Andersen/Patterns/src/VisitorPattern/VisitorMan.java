package VisitorPattern;

public class VisitorMan implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Послушал двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Измерил лакокрасочное покрытие");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Посидел в машине");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Попинал " + wheel.getName());
    }
}
