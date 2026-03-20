class Interest {
    int interest(int p, int t) {
        int r = 5;
        return (p * t * r) / 100;
    }

    int interest(int p, int t, int r) {
        return (p * t * r) / 100;
    }

    public static void main(String args[]) {
        Interest i = new Interest();
        System.out.println(i.interest(1000,2));
        System.out.println(i.interest(1000,2,10));
    }
}