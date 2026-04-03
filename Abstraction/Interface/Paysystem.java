interface Payment {
    void pay(int amount);
}

class UPI implements Payment {
    public void pay(int amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class Card implements Payment {
    public void pay(int amount) {
        System.out.println("Paid via Card: " + amount);
    }
}

class Paysystem {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);

        p = new Card();
        p.pay(1000);
    }
}