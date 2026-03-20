class Student {
    void result() {
        System.out.println("General Result");
    }
}

class EngineeringStudent extends Student {
    void result() {
        System.out.println("Engineering Grade A");
    }
}

class MedicalStudent extends Student {
    void result() {
        System.out.println("Medical Grade B");
    }

    public static void main(String args[]) {
        EngineeringStudent e = new EngineeringStudent();
        MedicalStudent m = new MedicalStudent();
        e.result();
        m.result();
    }
}