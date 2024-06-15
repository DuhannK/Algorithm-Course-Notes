/* Sınıf.txt dosyası içinde bulunan ifadeleri birleştirerek tek bir String haline getiren metodu yazınız. */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya_3 {
    public static void main(String[] args) throws FileNotFoundException {
        String Desktop = System.getProperty("user.home") + "/Desktop/";     // Kolay kontrol için dosyayı masa üstünde oluşturma
        
        File f = new File (Desktop + "Sınıf.txt");
        Scanner k = new Scanner(f);
        
        String tüm_str = "";
        
        while(k.hasNext()){
            tüm_str += k.nextLine();
        }
        
        System.out.println(tüm_str);
        
        k.close();
    }
}
