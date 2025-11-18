import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double hargaMotor, uangMuka, sisa, bunga, totalBayar, cicilan;
        int lamaCicilan;

        System.out.print("Masukkan harga motor: ");
        hargaMotor = sc.nextDouble();
        System.out.print("Masukkan uang muka: ");
        uangMuka = sc.nextDouble();
        System.out.print("Masukkan lama cicilan (bulan): ");
        lamaCicilan = sc.nextInt();

        sisa = hargaMotor - uangMuka;
        bunga = 0.01*sisa*lamaCicilan;
        totalBayar = sisa +bunga;
        cicilan = totalBayar / lamaCicilan;

        System.out.print("Jumlah cicilan per bulan: Rp. " + cicilan);
    }
}