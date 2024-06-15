/* Klavyeden rastgele sayılar giriliyor. Bu sayılar içinde tam sayı olanları sayı.txt dosyasına, ondalıklı olanları ondalıklı.txt dosyasına yazan programı yazınız. */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya_1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Desktop = System.getProperty("user.home") + "/Desktop/"; // Kolay kontrol için dosyayı masa üstünde oluşturma

        FileWriter tamSayiDosyasi = new FileWriter(Desktop + "sayı.txt");
        FileWriter ondalikliSayiDosyasi = new FileWriter(Desktop + "ondalıklı.txt");

        System.out.println("Rastgele sayılar girin (çıkmak için '0' tuşlayın):");
        while (true) {
            String sayı = scanner.nextLine();
            Double sayılar = Double.parseDouble(sayı);
            
            if (sayılar == 0) {
                break;
            }

            if (sayılar % 1 != 0) {
                ondalikliSayiDosyasi.write(sayı + "\n");
            } 
            else {
                tamSayiDosyasi.write(sayı + "\n");
            }

        }
        System.out.println("Sayılar dosyalara yazıldı.");
        tamSayiDosyasi.close();
        ondalikliSayiDosyasi.close();
    }
}
