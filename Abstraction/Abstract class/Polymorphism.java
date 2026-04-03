abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Moo");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cow();
        a.sound();
    }
}