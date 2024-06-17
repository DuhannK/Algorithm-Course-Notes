import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class orn_10_dosya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File klasor;
        String dosya = "c:\\";
        System.out.println("1 - Ekle");
        System.out.println("2 - Sil");
        System.out.println("3 - Listele");
        System.out.println("4 - Çıkış");
        System.out.println("Seçiniz");
        
        int seçim = scanner.nextInt();
        if(seçim == 1){
            System.out.print("Dosya adı gir: ");
            String ad = scanner.next();
            try {
                klasor = new File(dosya+ad+".txt");
                if(klasor.exists()){
                    klasor.createNewFile();
                }
            } catch (Exception e) {
            }
        }
        else if(seçim == 2){
            System.out.println("Silinecek dosyanın adını girin: ");
            String dosyaadı = scanner.next();
            klasor = new File(dosya + dosyaadı+"txt");
            if(klasor.exists()){
                klasor.delete();
                System.out.println(dosyaadı + " Dosya silindi.");
            }
        }
        
        else if(seçim == 3){
            klasor = new File(dosya);
            File[] list = klasor.listFiles();
            
            for(int i = 0; i < list.length; i++){
                System.out.println(list[i].getName());
            }
        }
        else if (seçim == 4) {
            System.out.println("Programdan çıkılıyor...");
            System.exit(0);
        } 
        else {
            System.out.println("Yanlış seçim");
        }
    }
}
