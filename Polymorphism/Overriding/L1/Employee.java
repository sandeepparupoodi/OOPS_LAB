class Employee {
    void work() {
        System.out.println("Employee working");
    }
}

class Developer extends Employee {
    void work() {
        System.out.println("Developer coding");
    }

    public static void main(String args[]) {
        Developer d = new Developer();
        d.work();
    }
}