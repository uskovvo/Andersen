package VisitorPattern;

public class CarElement implements Element{
    Element[] elements;

    public CarElement() {
        this.elements = new Element[] {
                new WheelElement("переднее правое колесо"),
                new WheelElement("переднее левое колесо"),
                new WheelElement("заднее правое колесо"),
                new WheelElement("заднее левое колесо"),
                new BodyElement(), new EngineElement()};
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element el: elements){
            el.accept(visitor);
        }
        visitor.visit(this);
    }
}
