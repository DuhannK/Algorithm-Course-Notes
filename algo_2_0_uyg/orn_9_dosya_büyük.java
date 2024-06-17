import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class orn_9_dosya_büyük{
    public static void main(String[] args) {
    
        PrintWriter p = null;
        File dosya = new File("buyukler.txt");
        int[][] matris = {{5,10,15,2},{3,4,8,1},{13,23,2,9}};
        try {
            if(!dosya.exists()){
                dosya.createNewFile();
            }
            p = new PrintWriter(new FileOutputStream(dosya,false));
          
            for(int i = 0; i < matris.length; i++){
                int eb = matris[i][0];
                for(int j = 0; i < matris[i].length; j++){
                    if(matris[i][j] > eb){
                        eb = matris[i][j];
                    }
                }
                p.println(eb + " ");
            }
            
        } catch (Exception e) {
        }
        p.close();
    }
}