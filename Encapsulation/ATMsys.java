class ATM {
    private int pin = 1234;

    public void checkPin(int p) {
        if (p == pin)
            System.out.println("Access Granted");
        else
            System.out.println("Wrong PIN");
    }
}

class ATMsys {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.checkPin(1111);
        a.checkPin(1234);
    }
}