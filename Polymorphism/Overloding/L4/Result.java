class Result {
    void result(int total){
        System.out.println("Total "+total);
    }
    void result(int total,double attend){
        System.out.println("Total "+total+" Attendance "+attend);
    }
    public static void main(String args[]){
        Result r=new Result();
        r.result(450);
        r.result(450,85.5);
    }
}