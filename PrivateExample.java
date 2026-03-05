class PrivateExample {
    private int number = 20;

    private void display() {
        System.out.println("Private method, number = " + number);
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.display(); // works here, inside the class
    }
}