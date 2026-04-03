abstract class Bank {
    abstract int getInterest();
}

class SBI extends Bank {
    int getInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    int getInterest() {
        return 8;
    }
}

class Banksys {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println(b.getInterest());

        b = new HDFC();
        System.out.println(b.getInterest());
    }
}