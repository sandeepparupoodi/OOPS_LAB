class Player {
    void play() {
        System.out.println("Player playing");
    }
}

class CricketPlayer extends Player {
    void play() {
        System.out.println("Playing Cricket");
    }
}

class FootballPlayer extends Player {
    void play() {
        System.out.println("Playing Football");
    }

    public static void main(String args[]) {
        CricketPlayer c = new CricketPlayer();
        FootballPlayer f = new FootballPlayer();
        c.play();
        f.play();
    }
}