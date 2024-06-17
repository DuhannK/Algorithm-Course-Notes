public class orn_8_binaryArama {

    public static void main(String[] args) {
        int[] dizi = {2,5,7,12,17,21,41,56,97,101};
        int sonuç = binary_arama(dizi, 0, dizi.length-1, 5);
        if(sonuç != -1){
            System.out.println("var");
        }
        else{
            System.out.println("yok");
        }
    }

    public static int binary_arama(int[] dizi, int i, int j, int x) {
        if (j >= i) {
            int m = i + (j - i) / 2; // Orta elemanın indeksini doğru şekilde hesaplayın
            if (dizi[m] == x) {
                return m;
            }
            if (dizi[m] > x) {
                return binary_arama(dizi, i, m - 1, x);
            }
            return binary_arama(dizi, m + 1, j, x); // Parametre sırasını düzeltin
        }
        return -1;
    }
}
