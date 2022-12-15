package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static  final Map<String, Shape> shapes = new HashMap<>();
        public Shape getShape(String shapeName){
            Shape shape = shapes.get(shapeName);
            if(shape == null){
                switch (shapeName) {
                    case "круг" -> shape = new Circle();
                    case "квадрат" -> shape = new Square();
                    case "точка" -> shape = new Point();
                }
                shapes.put(shapeName, shape);
            }
            return shape;
        }
}
