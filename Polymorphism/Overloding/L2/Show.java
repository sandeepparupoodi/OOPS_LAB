class Show {

    void show(String name) {
        System.out.println(name);
    }

    void show(String name, int age) {
        System.out.println(name + " " + age);
    }

    void show(String name, int age, String city) {
        System.out.println(name + " " + age + " " + city);
    }

    public static void main(String args[]) {
        Show s = new Show();
        s.show("Ram");
        s.show("Ram",20);
        s.show("Ram",20,"Chennai");
    }
}