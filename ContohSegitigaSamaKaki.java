import java.util.Scanner;

public class ContohSegitigaSamaKaki {
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

        luas = 1/2 * alas * tinggi;
        System.out.println("Hasil luas: " + luas);

        
   }
}     