
public class orn_3_palidrom {

    public static void main(String[] args) {
        String kelime = "anna";
        if(polidrom(kelime)){
            System.out.println("Polidromdur.");
        }
        else{
            System.out.println("Pol değil!!");
        }
        
    }
    public static boolean polidrom(String kelime){
        int uzunluk = (kelime.length() / 2);
        boolean pol = true;
        for(int i = 0; i < uzunluk; i++){
            if(kelime.charAt(i) != kelime.charAt(kelime.length()-i-1)){
                pol = false;
            }
        }
        return pol;
    }
}