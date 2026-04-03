class User {
    private String password;

    public void setPassword(String p) {
        password = p;
    }
}

class Passwordsys {
    public static void main(String[] args) {
        User u = new User();
        u.setPassword("12345");
    }
}