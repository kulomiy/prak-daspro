import java.util.Scanner;

public class PersegiAngka17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        for (int i = 1; i <= n; i++) {          // baris
            for (int j = 1; j <= n; j++) {      // kolom
                // Cek posisi tepi
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");  // angka pinggir = nilai input
                } else {
                    System.out.print("  ");     // bagian dalam kosong
                }
            }
            System.out.println();               // ganti baris
        }
    }
}
