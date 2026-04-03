abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle");
    }
}

class Area {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}