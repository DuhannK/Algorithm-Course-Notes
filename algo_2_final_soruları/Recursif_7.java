/*  Bir metoda iki sayısal dizi parametre olarak gönderiliyor. 1. diziyi 2. dizinin indislerini göstermektedir.
    1. dizinin göstermiş olduğu indislerdeki sayıları toplayıp geri döndüren metodu oluşturunuz (dolaylı adresleme) */

public class Recursif_7 {
    public static void main(String[] args) {
        int indisler[] = {1, 2, 2};
        int dizi[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println(toplaDizi(indisler, dizi, 0));
    }
    
    public static int toplaDizi(int indisler[], int dizi[], int k){
        if(k >= indisler.length) return 0;
        return dizi[indisler[k]] + toplaDizi(indisler, dizi, ++k);
    }
}
