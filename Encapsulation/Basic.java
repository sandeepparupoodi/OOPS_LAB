class Student {
    private String name;  // hidden data

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

class Basic {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sandeep");
        System.out.println(s.getName());
    }
}