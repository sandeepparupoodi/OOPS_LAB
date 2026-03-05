public class PublicExample {
    public int number = 10;

    public void display() {
        System.out.println("Public method, number = " + number);
    }

    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.display();
    }
}