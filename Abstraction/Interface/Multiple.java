interface Calculator {
    void add(int a, int b);
    void sub(int a, int b);
}

class CalcImpl implements Calculator {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

class Multiple {
    public static void main(String[] args) {
        Calculator c = new CalcImpl();
        c.add(10, 5);
        c.sub(10, 5);
    }
}