abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

class Arrays {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};

        for (Shape s : shapes)
            s.draw();
    }
}