
import java.util.Scanner;

class ogrenci {
    public String ad_soyad;
    public int numara;

    public ogrenci(String isim, int no) {
        ad_soyad = isim;
        numara = no;
    }

    private void ekrana_yaz(ogrenci[] adam) {                                   // Sadece bu class içinden erişilebilir
        for (int i = 0; i < 5; i++) {
            if (adam[i].ad_soyad.charAt(0) == 'A') {
                System.out.println(adam[i].ad_soyad);
            }
        }
    }

    public void erişim(ogrenci[] adam) {
        ekrana_yaz(adam);
    }
}

public class UML_4 {
    public static void main(String[] args) {
        ogrenci A[] = new ogrenci[5];                                           // Tanımlama
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Öğrencinin adını ve soyadını girin:");
            String isim = scanner.nextLine();
            System.out.println("Öğrencinin numarasını girin:");
            int no = scanner.nextInt();
            scanner.nextLine();                                                 // Enter tuşunu tüketmek için
            A[i] = new ogrenci(isim, no);
        }

        A[0].erişim(A);
    }
}
