interface Shape {
    void area();
}

class Circle implements Shape {
    public void area() {
        System.out.println("Circle area");
    }
}

class Rectangle implements Shape {
    public void area() {
        System.out.println("Rectangle area");
    }
}

class Objects {
    public static void main(String[] args) {
        Shape[] s = {new Circle(), new Rectangle()};

        for (Shape obj : s)
            obj.area();
    }
}