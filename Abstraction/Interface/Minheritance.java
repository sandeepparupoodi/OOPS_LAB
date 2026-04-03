interface Fly {
    void fly();
}

interface Swim {
    void swim();
}

class Duck implements Fly, Swim {
    public void fly() {
        System.out.println("Flying");
    }

    public void swim() {
        System.out.println("Swimming");
    }
}

class Minheritance {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}