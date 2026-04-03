abstract class Person {
    Person() {
        System.out.println("Person created");
    }

    abstract void work();
}

class Student extends Person {
    void work() {
        System.out.println("Studying");
    }
}

class Constructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.work();
    }
}