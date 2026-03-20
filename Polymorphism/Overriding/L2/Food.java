class Food {
    int price() {
        return 0;
    }
}

class Pizza extends Food {
    int price() {
        return 250;
    }
}

class Burger extends Food {
    int price() {
        return 150;
    }
}

class Biryani extends Food {
    int price() {
        return 200;
    }

    public static void main(String args[]) {
        Pizza p = new Pizza();
        Burger b = new Burger();
        Biryani bi = new Biryani();
        System.out.println(p.price());
        System.out.println(b.price());
        System.out.println(bi.price());
    }
}