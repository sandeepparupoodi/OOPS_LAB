class Bank {
    void transaction(int amount){
        System.out.println("Deposit "+amount);
    }
    void transaction(double amount){
        System.out.println("Withdraw "+amount);
    }
    void transaction(int amount,long acc){
        System.out.println("Transfer "+amount+" to "+acc);
    }
    public static void main(String args[]){
        Bank b=new Bank();
        b.transaction(5000);
        b.transaction(2000.5);
        b.transaction(3000,1234567890L);
    }
}