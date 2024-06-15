/* iki sayısal dizideki birbirine göre büyük olan sayıları ekrana yazan recursif metodu oluşturunuz */

public class Recursif_8 {
    public static void main(String[] args) {
        int A[] = {5, 7, 9, 10};
        int B[] = {7, 9, 5, 12};
        
        büyük(A, B, 0);
    }
    
    public static void büyük(int A[], int B[], int k){
        if(k >= A.length) System.exit(0);
        if(A[k] > B[k]){
            System.out.println(A[k]);
            büyük(A, B, ++k);
        }
        else {
            System.out.println(B[k]);
            büyük(A, B, ++k);
        }
    }
}
