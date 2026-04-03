abstract class Employee {
    abstract void salary();
}

class FullTime extends Employee {
    void salary() {
        System.out.println("Salary: 50000");
    }
}

class PartTime extends Employee {
    void salary() {
        System.out.println("Salary: 20000");
    }
}

class Salary {
    public static void main(String[] args) {
        Employee e;

        e = new FullTime();
        e.salary();

        e = new PartTime();
        e.salary();
    }
}