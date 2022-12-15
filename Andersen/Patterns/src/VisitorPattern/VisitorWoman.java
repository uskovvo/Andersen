package VisitorPattern;

public class VisitorWoman implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Я девочка, не знаю куда смотреть");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Красивенькая машинка");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Это моя новенькая машинка");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("А в " + wheel.getName() + " какой вкус воздуха?");
    }
}
