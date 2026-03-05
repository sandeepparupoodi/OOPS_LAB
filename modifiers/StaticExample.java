class StaticExample {
    static int number = 60;

    static void display() {
        System.out.println("Static method, number = " + number);
    }

    public static void main(String[] args) {
        StaticExample.display(); // no need to create object
    }
}