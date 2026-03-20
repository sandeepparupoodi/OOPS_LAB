class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }

    public static void main(String args[]) {
        Circle c = new Circle();
        c.draw();
    }
}