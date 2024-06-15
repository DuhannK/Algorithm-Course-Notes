/* Kendisine parametre olarak gelen karakter dizisini ters çevirip tek bir string haline getirip ekrana yazn recursif metodu oluşturunuz */

public class Recursif_5 {
    public static void main(String[] args) {
        char karakterler[] = {'a','b','c','d'};
        karakter_ters(karakterler, "", karakterler.length-1);
    }
    
    public static void karakter_ters(char C[], String str, int k){
        if(k < 0){
            System.out.println(str);
            System.exit(0);
        }
        karakter_ters(C, str += C[k], --k);
    }
}
