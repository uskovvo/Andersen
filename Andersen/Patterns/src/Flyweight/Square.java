package Flyweight;

public class Square implements Shape{
    int r = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + "): рисуем квадрат со стороной " + r);
    }
}
