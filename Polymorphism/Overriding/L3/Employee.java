class Employee {
    int calculateSalary() {
        return 10000;
    }
}

class Manager extends Employee {
    int calculateSalary() {
        return 30000;
    }
}

class Clerk extends Employee {
    int calculateSalary() {
        return 15000;
    }

    public static void main(String args[]) {
        Manager m = new Manager();
        Clerk c = new Clerk();
        System.out.println(m.calculateSalary());
        System.out.println(c.calculateSalary());
    }
}