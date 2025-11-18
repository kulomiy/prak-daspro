import java.util.Scanner;

public class PenjualanKopiSenja17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        int totalPelangganSemuaCabang = 0;
        int totalItemSemuaCabang = 0;

        // Perulangan untuk setiap cabang
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            // Perulangan untuk setiap pelanggan di cabang ini
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem;
            }

            // Tampilkan hasil per cabang
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + " item");

            // Akumulasi total keseluruhan
            totalPelangganSemuaCabang += jumlahPelanggan;
            totalItemSemuaCabang += totalItemCabang;
        }

        // Tampilkan total seluruh cabang
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSemuaCabang + " orang");
        System.out.println("Item terjual: " + totalItemSemuaCabang + " item");
    }
}
