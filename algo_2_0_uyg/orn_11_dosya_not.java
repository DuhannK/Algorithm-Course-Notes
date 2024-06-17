import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class orn_11_dosya_not {    //dosya içindeki verilere göre geçip kaldığını dosyaya aktaran kod
    public static void main(String[] args) {
        try{
            File dosya = new File("notlar.txt");
            File dkalan = new File("kalanlar.txt");
            File dgeçen = new File("geçenler.txt");
            if(!dosya.exists()) dosya.createNewFile();
            PrintWriter yazici = new PrintWriter(dosya);
            PrintWriter yazicik = new PrintWriter(dkalan);
            PrintWriter yazicig = new PrintWriter(dgeçen);
            Scanner sc = new Scanner(System.in);
            String veri = "";
            int sayı;
            while(true){
                veri = sc.nextLine();
                sayı = Integer.parseInt(veri);
                if(sayı<50){
                    yazicik.print(sayı);
                }
                else{
                    yazici.print(sayı);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

