import java.util.Scanner;

public class ContohStudiKasus1 {
   public static void main(String[] args) {

      Scanner sc =new Scanner(System.in);

      int panjang;
      int lebar;
      int luas;
      int keliling;

      System.out.println("Masukkan panjang: ");
      panjang = sc.nextInt();
      System.out.println("Masukkan lebar: ");
      lebar = sc.nextInt();

      luas = panjang * lebar;
      System.out.println("Hasil luas: " + luas);
      keliling = 2 * (panjang + lebar);
      System.out.println("Hasil keliling: " + keliling);
}
    
}