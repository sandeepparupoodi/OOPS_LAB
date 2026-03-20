class Series {
    void series(int n){
        for(int i=1;i<=n;i++)
            System.out.print(i+" ");
        System.out.println();
    }
    void series(int n,boolean even){
        for(int i=2;i<=2*n;i+=2)
            System.out.print(i+" ");
    }
    public static void main(String args[]){
        Series s=new Series();
        s.series(5);
        s.series(5,true);
    }
}