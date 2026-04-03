class Company {
    private final String name = "Google";

    public String getName() {
        return name;
    }
}

class Readonly {
    public static void main(String[] args) {
        Company c = new Company();
        System.out.println(c.getName());
    }
}