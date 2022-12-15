package Flyweight;

public class Circle implements Shape{
    int r = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + "): рисуем круг радиусом " + r);
    }
}
