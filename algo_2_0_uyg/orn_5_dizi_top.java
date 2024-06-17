
public class orn_5_dizi_top {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,5};
        System.out.println(dizi_toplama(dizi, 0, 0));
    }
    
    public static int dizi_toplama(int[] dizi, int toplam, int i){              //Kendi yaptığım
        if(i >= dizi.length) return toplam;
        return dizi_toplama(dizi, toplam+=dizi[i], ++i);
       
    }
   
    public static int rec_Top(int[] dizi, int i){                               //Hocanın yaptığı
        if(dizi == null || i<0 || i >= dizi.length) return 0;
        if(i == dizi.length-1) return dizi[i];
        
        return dizi[i] + rec_Top(dizi, i+1);
    }
}