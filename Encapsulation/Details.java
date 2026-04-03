class Student {
    private String name;
    private int marks;

    public void setData(String n, int m) {
        name = n;
        marks = m;
    }

    public void display() {
        System.out.println(name + " " + marks);
    }
}

class Details  {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Sai", 95);
        s.display();
    }
}