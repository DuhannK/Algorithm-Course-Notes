class Personel{
    int id;
    String isim;
    
    Personel(int id, String isim){
        this.id = id;
        this.isim = isim;
    }
}

class Emekci extends Personel{
    String ucret;
    public Emekci(int id, String isim) {
        super(id, isim);
        this.ucret = "1.499";
    }
    void göster(){
        System.out.println(id + "---" + isim + "---" + ucret);
    }
}

public class orn_15 {
    public static void main(String[] args) {
        Emekci e1 = new Emekci(1, "Ayşe");
        e1.göster();
    }
}

//klavyeden girilen 10 kşiyi yazdır