class Display {
    void display() {
        System.out.println("Hello");
    }

    void display(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String args[]) {
        Display d = new Display();
        d.display();
        d.display("Sam");
    }
}