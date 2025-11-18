import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jarak, liter, biaya;

        System.out.print("Masukkan jarak perjalanan (km): ");
        jarak = sc.nextDouble();

        liter = jarak/2;
        biaya = liter*10000;

        System.out.println("Biaya bensin yang diperlukan: Rp. " + biaya);
    }
}