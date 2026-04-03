class Person {
    private int age;

    public void setAge(int a) {
        if (a > 0)
            age = a;
        else
            System.out.println("Invalid age");
    }

    public int getAge() {
        return age;
    }
}

class Validation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-5);
        p.setAge(20);
        System.out.println(p.getAge());
    }
}