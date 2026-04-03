abstract class Notification {
    abstract void send(String msg);
}

class Email extends Notification {
    void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

class SMS extends Notification {
    void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}

class Notifisys {
    public static void main(String[] args) {
        Notification n;

        n = new Email();
        n.send("Hello");

        n = new SMS();
        n.send("Hi");
    }
}