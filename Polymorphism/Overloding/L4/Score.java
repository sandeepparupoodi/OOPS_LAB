class Score {
    int score(int p){
        return p;
    }
    int score(int p,int level){
        return p*level;
    }
    int score(int p,int level,int bonus){
        return p*level+bonus;
    }
    public static void main(String args[]){
        Score s=new Score();
        System.out.println(s.score(100));
        System.out.println(s.score(100,2));
        System.out.println(s.score(100,2,50));
    }
}