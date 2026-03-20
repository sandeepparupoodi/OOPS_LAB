class Transport {
    int fare() {
        return 0;
    }
}

class Bus extends Transport {
    int fare() {
        return 50;
    }
}

class Train extends Transport {
    int fare() {
        return 120;
    }
}

class Flight extends Transport {
    int fare() {
        return 5000;
    }

    public static void main(String args[]) {
        Bus b = new Bus();
        Train t = new Train();
        Flight f = new Flight();
        System.out.println(b.fare());
        System.out.println(t.fare());
        System.out.println(f.fare());
    }
}