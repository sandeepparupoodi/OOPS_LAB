class DefaultExample {
    int number = 40; // default access

    void display() {
        System.out.println("Default method, number = " + number);
    }

    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.display();
    }
}