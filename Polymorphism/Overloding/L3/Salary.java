class Salary {

    int salary(int basic) {
        return basic;
    }

    int salary(int basic, int bonus) {
        return basic + bonus;
    }

    int salary(int basic, int bonus, int allowance) {
        return basic + bonus + allowance;
    }

    public static void main(String args[]) {
        Salary s = new Salary();
        System.out.println(s.salary(20000));
        System.out.println(s.salary(20000,5000));
        System.out.println(s.salary(20000,5000,3000));
    }
}