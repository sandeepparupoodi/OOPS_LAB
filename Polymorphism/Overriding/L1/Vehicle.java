class Vehicle {
    void move() {
        System.out.println("Vehicle moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car moving");
    }

    public static void main(String args[]) {
        Car c = new Car();
        c.move();
    }
}