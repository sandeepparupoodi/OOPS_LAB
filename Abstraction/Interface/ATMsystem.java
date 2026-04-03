interface ATM {
    void withdraw(int amt);
    void deposit(int amt);
}

class SBI implements ATM {
    int balance = 1000;

    public void withdraw(int amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdraw: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }
}

class ATMsystem {
    public static void main(String[] args) {
        ATM a = new SBI();
        a.deposit(500);
        a.withdraw(300);
    }
}