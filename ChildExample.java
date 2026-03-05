abstract class AbstractExample {
    abstract void display(); // abstract method
}

class ChildExample extends AbstractExample {
    void display() {
        System.out.println("Abstract method implemented in child class");
    }

    public static void main(String[] args) {
        ChildExample obj = new ChildExample();
        obj.display();
    }
}