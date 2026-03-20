class Marks {

    int calculateMarks(int a, int b, int c) {
        return a + b + c;
    }

    int calculateMarks(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static void main(String args[]) {
        Marks m = new Marks();
        System.out.println(m.calculateMarks(10,20,30));
        System.out.println(m.calculateMarks(10,20,30,40,50));
    }
}