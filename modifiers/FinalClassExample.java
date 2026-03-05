final class FinalClassExample {
    final int number = 50;

    final void display() {
        System.out.println("Final method, number = " + number);
    }

    public static void main(String[] args) {
        FinalClassExample obj = new FinalClassExample();
        obj.display();
    }
}