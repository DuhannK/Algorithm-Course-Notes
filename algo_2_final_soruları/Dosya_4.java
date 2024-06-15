/* Sınıf.txt içinde bulunan ifadeleri tek boyutlu String dizisine atan metodu yazınız. */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya_4 {
    public static void main(String[] args) throws IOException {
        String Desktop = System.getProperty("user.home") + "/Desktop/";     // Kolay kontrol için dosyayı masa üstünde oluşturma
        
        File f = new File(Desktop + "Sınıf.txt");
        Scanner k = new Scanner(f);
        Scanner k2 = new Scanner(f);
        
        int sayaç = 0;
        while(k.hasNext()){
            k.nextLine();
            sayaç++;
        }
        k.close();
        
        String dizi[] = new String[sayaç];
        sayaç = 0;
        
        while(k2.hasNext()){
            dizi[sayaç] = k2.nextLine();
            sayaç++;
        }
        k2.close();
        
        System.out.println("Aktarıldı" + "\n");
        
        for (String dizi1 : dizi) {
            System.out.println(dizi1);
        }
    }
}
