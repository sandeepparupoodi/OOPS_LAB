abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class Partial {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.sleep();
    }
}