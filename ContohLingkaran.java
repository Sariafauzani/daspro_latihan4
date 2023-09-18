import java.util.Scanner;

public class ContohLingkaran {
   public static void main(String[] args) {

      Scanner sc =new Scanner(System.in);

      double phi;
      int r;
      int luas;
      int keliling;

      System.out.println("Masukkan phi: ");
      phi = sc.nextDouble();
      System.out.println("Masukkan jari-jari: ");
      r = sc.nextInt();

      luas = (int)phi * r * r;
      keliling = 2 * r * r;

      System.out.println("Hasil luas: " + luas);
      System.out.println("Hasil keliling: " + keliling);
   }
}     