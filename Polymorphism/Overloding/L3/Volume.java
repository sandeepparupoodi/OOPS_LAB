class Volume {

    int volume(int side) {
        return side * side * side;
    }

    double volume(double r, int h) {
        return 3.14 * r * r * h;
    }

    int volume(int l, int b, int h) {
        return l * b * h;
    }

    public static void main(String args[]) {
        Volume v = new Volume();
        System.out.println(v.volume(3));
        System.out.println(v.volume(2.5,5));
        System.out.println(v.volume(2,3,4));
    }
}