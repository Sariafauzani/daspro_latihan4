import java.util.Scanner;

public class ContohSegitigaSamaSisi {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int alas;
        int tinggi;
        int sisi;
        int luas;
        int keliling;
        
        System.out.println("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        luas = alas * tinggi/2;
        System.out.println("Hasil luas: " + luas);

        System.out.println("Masukkan sisi miring: ");
        sisi = sc.nextInt();

        keliling = 3 * sisi;
        System.out.println("Hasil keliling: " + keliling);
   }
}     