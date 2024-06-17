abstract class Sekil{
    double boyut1;
    double boyut2;
    Sekil(double a, double b){
        boyut1 = a;
        boyut2 = b;
    }
    abstract double alan();
}

class Dikdortgen extends Sekil{

    public Dikdortgen(double a, double b) {
        super(a, b);
    }

    @Override
    double alan() {
        return boyut1*boyut2;
    }
    
}

class Ucgen extends Sekil{

    public Ucgen(double a, double b) {
        super(a, b);
    }

    @Override
    double alan() {
        return boyut1*boyut2/2;
    }
    
}


public class orn_13 {
    public static void main(String[] args) {
        Dikdortgen d = new Dikdortgen(2,5);
        Ucgen u = new Ucgen(6, 3);
        
        System.out.println("Dikdörtgen alan = " + d.alan());
        System.out.println("Üçgen alan = " + u.alan());
    }
}
