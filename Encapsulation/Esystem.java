class Employee {
    private int salary;

    public void setSalary(int s) {
        if (s > 0)
            salary = s;
    }

    public int getSalary() {
        return salary;
    }
}

class Esystem {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(50000);
        System.out.println(e.getSalary());
    }
}