/* 10 kişilik sınıftaki öğrencilerin bilgilerini class dizisi şeklinde tutulmak isteniyor.İstenilen kodu yazınız. (Ad-soyad, numara, yaş) */

import java.util.Scanner;

class Ogrenci{
    public int yas;
    public int numara;
    public String ad_soyad;
}

public class UML_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ogrenci sinif[] = new Ogrenci[3];                  //Tanımlama
        
        for(int i = 0; i<10; i++){
           sinif[i] = new Ogrenci();                        //Yer Açma
           System.out.println("Yaş, Numara, Ad-Soyad giriniz");
           sinif[i].yas = scanner.nextInt();
           sinif[i].numara = scanner.nextInt();
           sinif[i].ad_soyad = scanner.next();
        }
    }
}
