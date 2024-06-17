abstract class Bankalar{
    abstract int faizOranı();
}

class YapıKredi extends Bankalar{

    @Override
    int faizOranı() {
        return 8;
    }   
}

class Garanti extends Bankalar{

    @Override
    int faizOranı() {
        return 7;
    }
    
}

public class orn_14 {
    public static void main(String[] args) {
        Bankalar b = new YapıKredi();
        System.out.println("Bankanın faiz oranı %" + b.faizOranı());
        b = new Garanti();
        System.out.println("Bankanın faiz oranı %" + b.faizOranı());
    }
}
