class Parent {
    void displayParent() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the Child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayParent();
        obj.displayChild();
    }
}