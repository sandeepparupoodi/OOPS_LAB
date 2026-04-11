package system;

import java.util.ArrayList;

interface StudentOps {
    void addStudent(String name);
    void display();
}

public class StudentManager implements StudentOps {
    ArrayList<String> list = new ArrayList<>();

    public void addStudent(String name) {
        list.add(name);
    }

    public void display() {
        for (String s : list)
            System.out.println(s);
    }

    public static void main(String[] args) {
        StudentManager obj = new StudentManager();

        obj.addStudent("Sandeep");
        obj.addStudent("Rahul");

        obj.display();
    }
}