interface Animal {
    void eat();

    default void breathe() {
        System.out.println("Breathing...");
    }

    static void info() {
        System.out.println("Animal Interface");
    }
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }
}

class Default {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.breathe();
        Animal.info();
    }
}