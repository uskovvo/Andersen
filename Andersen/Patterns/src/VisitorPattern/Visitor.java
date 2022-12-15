package VisitorPattern;

public interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
    void visit(CarElement car);
    void visit(WheelElement wheel);
}
