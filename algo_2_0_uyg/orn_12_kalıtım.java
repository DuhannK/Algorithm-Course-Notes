abstract class A{
    abstract void soyutMet();
    void somutMet(){
        System.out.println("Somut metod çalışıyor");
    }
}

class B extends A{

   
    void soyutMet() {
        System.out.println("Ben bir Soyut Metodum");
    }
    
}

public class orn_12_kalıtım {
    public static void main(String[] args) {
        B b = new B();
        b.soyutMet();
        b.somutMet();
    }
}
