/* Kendisine parametre olarak gelen sayısal dizideki çift no'lu indisteki sayıları toplayıp ekrana yazan recursif metodu oluşturunuz */

public class Recursif_6 {
    public static void main(String[] args) {
        int sayılar[] = {1, 2, 4, 5, 6, 8, 10, 48};
        toplama_cift_indis(sayılar, 0, 0);
    }
    
    public static void toplama_cift_indis(int S[], int toplam, int k){
        if(k >= S.length){
            System.out.println(toplam);
            System.exit(0);
        }
        if(k % 2 == 0) toplama_cift_indis(S, toplam += S[k], ++k);
        toplama_cift_indis(S, toplam, ++k);
    }
}
