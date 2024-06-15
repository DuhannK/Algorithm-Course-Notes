/* Klavyeden girilen String tersten ve düzden okununca aynı ifadeyi veriyorsa(polidrom) polidrom.txt dosyasına yazan programı yapınız.  */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Desktop = System.getProperty("user.home") + "/Desktop/"; // Kolay kontrol için dosyayı masa üstünde oluşturma

        System.out.print("Kelime giriniz: ");
        String kelime = scanner.nextLine();
        
        File f = new File(Desktop + "polidrom.txt");
        FileWriter fw = new FileWriter(f);
        
        boolean pol = true;
        for(int i = 0; i < kelime.length()/2; i++){
            if(kelime.charAt(i) != kelime.charAt(kelime.length()-1-i)){
                pol = false;
            }
        }
        
        if(pol){
            fw.write(kelime);
        }
        
        fw.close();
    }
}
