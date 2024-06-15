/* Bir sayısal dizideki en büyük ve en küçük sayıyı ekrana yazan recursif metodu oluşturunuz. Tek bir metod yazılacaktır */

public class Recursif_4 {
    public static void main(String[] args) {
        int sayılar[] = {7, 13, 52, 3, 61, 5, 36};
        buyuk_kucuk_bulma(sayılar, sayılar[0], sayılar[0], 0);
    }
    
    public static void buyuk_kucuk_bulma(int S[], int buyuk, int kucuk, int k){
        if(k >= S.length){
            System.out.println("Büyük sayı: " + buyuk + "  |   Küçük sayı : " + kucuk );
            System.exit(0);
        }
        if(buyuk < S[k]) buyuk_kucuk_bulma(S, S[k], kucuk, ++k);
        if(kucuk > S[k]) buyuk_kucuk_bulma(S, buyuk, S[k], ++k);
        buyuk_kucuk_bulma(S, buyuk, kucuk, ++k);
    }
}
