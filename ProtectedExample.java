class ProtectedExample {
    protected int number = 30;

    protected void display() {
        System.out.println("Protected method, number = " + number);
    }

    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        obj.display();
    }
}