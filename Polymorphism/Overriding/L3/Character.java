class Character {
    void attack() {
        System.out.println("Normal Attack");
    }
}

class Warrior extends Character {
    void attack() {
        System.out.println("Sword Attack");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Magic Attack");
    }
}

class Archer extends Character {
    void attack() {
        System.out.println("Arrow Attack");
    }

    public static void main(String args[]) {
        Warrior w = new Warrior();
        Mage m = new Mage();
        Archer a = new Archer();
        w.attack();
        m.attack();
        a.attack();
    }
}