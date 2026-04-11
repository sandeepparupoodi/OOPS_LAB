package calc;
import geometry.Shape;

public class Rectangle extends Shape {
    public void area() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}