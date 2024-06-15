/* 10 tane karmaşık(kompleks) sayı klavyeden giriliyor, bu sayıları tutuan class dizisini oluşturunuz. */

import java.util.Scanner;

class Kompleks{
    public int real;
    public int imaginary;
}

public class UML_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kompleks sayi[] = new Kompleks[10];             //Tanımlama
        for(int i = 0; i<10; i++){
            sayi[i] = new Kompleks();                    //Yer Açma
            
            System.out.println("Kompleks sayının real kısmını giriniz: ");
            sayi[i].real = scanner.nextInt();
            System.out.println("Kompleks sayının imaginary kısmını giriniz: ");
            sayi[i].imaginary = scanner.nextInt();
        }
    }
}
