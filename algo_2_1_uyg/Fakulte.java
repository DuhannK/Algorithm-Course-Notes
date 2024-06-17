
public class Fakulte extends isci {
    public static void main(String[] args) {
        new Fakulte();
    }
    public Fakulte(){
        System.out.println("Fakülte görevleri");
    }
}

class isci extends kisi{
    public isci(){
        this("2 aşırı yükleme işci metodu");
        System.out.println("işci metodu");
    }
    public isci(String s){
        System.out.println(s);
    }
}
class kisi{
    public kisi(){
        System.out.println("kişi görevleri");
    }
}
