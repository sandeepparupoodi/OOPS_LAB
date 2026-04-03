abstract class ATM {
    int balance = 1000;

    abstract void withdraw(int amt);

    void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }
}

class SBI extends ATM {
    void withdraw(int amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdraw: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class ATMsys {
    public static void main(String[] args) {
        ATM a = new SBI();
        a.deposit(500);
        a.withdraw(300);
    }
}