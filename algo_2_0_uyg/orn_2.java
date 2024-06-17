
import java.util.Scanner;

public class orn_2 {

    public static void main(String[] args) {
        int sayı = 5;
        System.out.println(faktoriel(sayı));
    
        System.out.println(fac(sayı));
        /*  sout içeriği
            5 * fac(4)
            5*4* fac(3)
            5*4*3* fac(2)
            5*4*3*2* fac(1)
            5*4*3*2*1
        */

}
    
    public static int faktoriel(int sayı){          //Benim yazdığım
        int sonuç = 1;
        for(int i = 2; i<=sayı; i++){
            sonuç *= i;
        }
        return sonuç;
    }
    
    public static  int fac(int sayı){
        if(sayı >=2){
            return sayı * fac(sayı-1);
        }
        else{
            return 1;
        }
    }
}
