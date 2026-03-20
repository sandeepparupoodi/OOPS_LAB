class Power {
    int power(int n) {
        return n * n;
    }

    int power(int n, int m) {
        int res = 1;
        for(int i=1;i<=m;i++)
            res = res * n;
        return res;
    }

    public static void main(String args[]) {
        Power p = new Power();
        System.out.println(p.power(4));
        System.out.println(p.power(2,3));
    }
}