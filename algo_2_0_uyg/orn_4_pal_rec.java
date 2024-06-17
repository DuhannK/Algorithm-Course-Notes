
public class orn_4_pal_rec {
    public static void main(String[] args) {
        if(pol("abccba", 0, 0)!= 0){
            System.out.println("Palidrom değil!");
        }
        else{
            System.out.println("Kelime palidromdur");
        }
        
        System.out.println(polindrom("neden"));
    
    }
    
    public static int pol(String kelime, int i, int sayaç){                     //Kendi Yaptığım
        if(i > kelime.length()/2) return  sayaç;
        
        if(kelime.charAt(i) != kelime.charAt(kelime.length()-i-1)){
            return pol(kelime, ++i, ++sayaç);
        }
        return pol(kelime, ++i, sayaç);
    }
    
    public static boolean polindrom(String str){                                //Hocanın yaptığı
        if(str.length()<2) return false;
        if(str.charAt(0)!= str.charAt(str.length()-1)) return false;
        else polindrom(str.substring(1, str.length()-2));
        return true;
    }
}

