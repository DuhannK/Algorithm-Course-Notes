/* Kendisine parametre olarak gelen tek boyutlu sayısal dizideki 3'e tam bölünebilen sayıların toplamını geri döndiren metodu yazınız */

public class Recursif_2 {
    public static void main(String[] args) {
        int sayılar[] = {1,3,5,6,11,12};
        
        int toplam = toplam_bul(sayılar, 0);
        System.out.println(toplam);
    }
    
    public static int toplam_bul(int a[], int i){
        if(i >= a.length) return 0;
        if(a[i] % 3 == 0) return a[i] + toplam_bul(a, ++i);
        return toplam_bul(a, ++i);
    }
}
