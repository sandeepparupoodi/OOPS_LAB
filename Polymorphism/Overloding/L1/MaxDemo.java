class MaxDemo {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return max(max(a,b), c);
    }

    public static void main(String args[]) {
        MaxDemo m = new MaxDemo();
        System.out.println(m.max(5,9));
        System.out.println(m.max(5,9,3));
    }
}