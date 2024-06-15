/* Kendisine parametre olarak gelen bir String dizisindeki ilk harfi 'A' olan Stringleri bulup ekrana yazan recursif metodu oluşturunuz */

public class Recursif_1{
    public static void main(String[] args) {
        String S[] = {"Ali", "Veli", "Ayşe", "Osman",};
        
        String_bul(S, 0);
    }
    
    public static void String_bul(String s[], int i){
        if(i >= s.length) System.exit(0);
        if(s[i].charAt(0) == 'A') System.out.println(s[i]);
        String_bul(s, ++i);
    }
}