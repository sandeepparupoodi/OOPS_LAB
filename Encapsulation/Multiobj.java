class Student {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

class Multiobj {
    public static void main(String[] args) {
        Student[] s = new Student[2];

        for (int i = 0; i < 2; i++)
            s[i] = new Student();

        s[0].setName("Naruto");
        s[1].setName("Sasuke");

        for (Student obj : s)
            System.out.println(obj.getName());
    }
}