
import java.util.Scanner;

public class orn_1 {

    public static void main(String[] args) {
       int a = 73;
       asalmi(a);
      
    }
    
    public static void asalmi(int sayı){            //Kendi yazdığım.
        boolean asal = true;
        
        for(int i = 2; i<sayı; i++){
            if(sayı%i == 0){
                asal = false;
            }
        }
        if(asal){
            System.out.println("Sayı asaldır");
        }
        else{
            System.out.println("Asal Değil!");
        }
    }
    
    public static boolean asalMi(int sayı){         //Hocanın yazdığı.
        if(sayı < 2){
            return false;
        }
        for(int i = 2; i<sayı; i++){
            if (sayı % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
