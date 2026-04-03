interface Notification {
    void send(String msg);
}

class Email implements Notification {
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

class SMS implements Notification {
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}

class Notifisystem {
    public static void main(String[] args) {
        Notification n = new Email();
        n.send("Hello");

        n = new SMS();
        n.send("Hi");
    }
}