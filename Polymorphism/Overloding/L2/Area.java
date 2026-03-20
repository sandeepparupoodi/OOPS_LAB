class Area {

    int area(int side) {
        return side * side;
    }

    int area(int l, int b) {
        return l * b;
    }

    double area(double r) {
        return 3.14 * r * r;
    }

    public static void main(String args[]) {
        Area a = new Area();
        System.out.println(a.area(4));
        System.out.println(a.area(4,5));
        System.out.println(a.area(2.5));
    }
}