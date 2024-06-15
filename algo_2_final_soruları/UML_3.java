

class Matematik {
    public void topla() {
        int x = 5;
        int y = 6;
        System.out.println(x + y);
    }
    
    public void topla(int x) {
        System.out.println(x + 10);
    }
    
    public void topla(int x, int y) {
        System.out.println(x + y);
    }
}

public class UML_3 {
    public static void main(String[] args) {
        Matematik x = new Matematik();
        
        x.topla();
        x.topla(5);
        x.topla(10, 20);
    }
}
