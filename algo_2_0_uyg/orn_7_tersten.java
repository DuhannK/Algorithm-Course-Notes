
public class orn_7_tersten {
    
    public static void main(String[] args) {
        ters("Duhan", 1);

    }
    public static void ters(String kelime, int i){
        if(i>kelime.length()) System.exit(0);
        System.out.print(kelime.charAt(kelime.length()-i));
        ters(kelime, ++i);
    }

}