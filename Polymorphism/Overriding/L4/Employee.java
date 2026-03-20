class Employee {
    void jobRole() {
        System.out.println("General Employee");
    }
}

class Developer extends Employee {
    void jobRole() {
        System.out.println("Coding");
    }
}

class Tester extends Employee {
    void jobRole() {
        System.out.println("Testing");
    }
}

class HR extends Employee {
    void jobRole() {
        System.out.println("Managing Employees");
    }
}

class Manager extends Employee {
    void jobRole() {
        System.out.println("Managing Projects");
    }
}

class Main {
    public static void main(String args[]) {

        Employee arr[] = {
            new Developer(),
            new Tester(),
            new HR(),
            new Manager()
        };

        for(Employee e : arr) {
            e.jobRole();
        }
    }
}