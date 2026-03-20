class SmartCalc {

    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a - b;
    }

    int calculate(int a, int b, int c) {
        return a * b * c;
    }

    int calculate(int a) {
        return a * a;
    }

    public static void main(String args[]) {
        SmartCalc s = new SmartCalc();
        System.out.println(s.calculate(5,3));
        System.out.println(s.calculate(5.5,3.2));
        System.out.println(s.calculate(2,3,4));
        System.out.println(s.calculate(6));
    }
}