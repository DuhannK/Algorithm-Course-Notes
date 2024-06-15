/* Kendisine parametre olarak gelen sayılar dizisindeki asal sayıları bulup ekrana yazan metodu recursif şekilde gerçekleştiriniz */

public class Recursif_3 {
    public static void main(String[] args) {
        int Sayılar[] = {3, 6, 7, 12, 97, 99 , 8, 11};
        
        asal_bul(Sayılar, 0);
    }
    
    public static void asal_bul(int A[], int i){
        if(i >= A.length) System.exit(0);
        if(Asal(A[i], 2) == true) System.out.println(A[i]);
        asal_bul(A, ++i);
    }
    
    public static boolean Asal(int a, int k){
        if(k > Math.sqrt(a)) return true;
        if(a % k == 0) return false;
        return Asal(a, ++k);
    }
}
