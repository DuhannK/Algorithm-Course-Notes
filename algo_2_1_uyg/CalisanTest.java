package algo_2_1_uyg;

interface calisan {
    void calis();
}

class mudur implements calisan {
    public void calis() {
        System.out.println("mudur calisiyor ");
    }
}

class genelMudur extends mudur {
    public void calis() {
        System.out.println("genel mudur calisiyor ");
    }

    public void toplantıYonet() {
        System.out.println("genel müdür toplantı yönetiyor ");
    }
}

class programci implements calisan {
    public void calis() {
        System.out.println("programci çalışıyor ");
    }
}

class analizProgramci extends programci {
    public void analizyap() {
        System.out.println("analiz programcı analiz yapıyor ");
    }
}

class sistemProgramci extends programci {
    public void sistemIncele() {
        System.out.println("sistem programcı sistemi inceliyor");
    }
}

class pazarlamaci implements calisan {
    public void calis() {
        System.out.println("pazarlamaci çalisiyor ");
    }
}

class sekreter implements calisan {
    public void calis() {
        System.out.println("sekreter calisiyor ");
    }
}

public class CalisanTest {
    public static void mesai(calisan[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i].calis();
        }
    }

    public static void main(String[] args) {
        calisan[] c = new calisan[6];
        c[0] = new programci();
        c[1] = new programci();
        c[2] = new programci();
        c[3] = new pazarlamaci();
        c[4] = new sekreter();
        c[5] = new genelMudur();

        mesai(c);
    }
}
