class Draw {
    void draw(int r){
        System.out.println("Draw circle radius "+r);
    }
    void draw(int l,int b){
        System.out.println("Draw rectangle");
    }
    void draw(double base,double h){
        System.out.println("Draw triangle");
    }
    public static void main(String args[]){
        Draw d=new Draw();
        d.draw(5);
        d.draw(4,6);
        d.draw(3.5,4.5);
    }
}