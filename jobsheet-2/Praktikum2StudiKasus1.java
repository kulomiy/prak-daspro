import java.util.Scanner;

public class Praktikum2StudiKasus1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gaji_pokok, jumlah_anak, tunjangan_anak = 150000, total_tunjangan_anak;
        double dana_pensiun = 0.05, gaji_bersih, total_dana_pensiun;

        System.out.println("Masukkan gaji pokok: ");
        gaji_pokok = sc.nextInt();
        System.out.println("Masukkan jumlah anak: ");
        jumlah_anak = sc.nextInt();

        total_tunjangan_anak = tunjangan_anak * jumlah_anak;
        total_dana_pensiun = dana_pensiun * gaji_pokok;

        gaji_bersih = gaji_pokok + total_tunjangan_anak - total_dana_pensiun;

        System.out.println("Total tunjangan anak: " + total_tunjangan_anak);
        System.out.println("Total dana pensiun: " + total_dana_pensiun);
        System.out.println("Jumlah gaji bersih: " + gaji_bersih);
    }
}