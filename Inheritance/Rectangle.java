class Shape {
    void displayShape() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    void displayCircle() {
        System.out.println("This is a Circle");
    }
}

class Rectangle extends Shape {
    void displayRectangle() {
        System.out.println("This is a Rectangle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.displayShape();
        c.displayCircle();

        Rectangle r = new Rectangle();
        r.displayShape();
        r.displayRectangle();
    }
}