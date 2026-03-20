class Bank {
    int getRate() {
        return 0;
    }
}

class SBI extends Bank {
    int getRate() {
        return 7;
    }
}

class HDFC extends Bank {
    int getRate() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRate() {
        return 9;
    }

    public static void main(String args[]) {
        SBI s = new SBI();
        HDFC h = new HDFC();
        ICICI i = new ICICI();
        System.out.println(s.getRate());
        System.out.println(h.getRate());
        System.out.println(i.getRate());
    }
}