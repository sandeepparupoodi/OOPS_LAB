class Bank {
    private int balance = 1000;

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }

    public int getBalance() {
        return balance;
    }
}

class Banksys {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(500);
        b.withdraw(200);
        System.out.println("Balance: " + b.getBalance());
    }
}