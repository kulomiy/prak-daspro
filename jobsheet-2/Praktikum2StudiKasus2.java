import java.util.Scanner;

public class Praktikum2StudiKasus2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int panjang_tanah, lebar_tanah, luas_tanah, diameter_lingkaran, panjang_sisi_persegi, jari_jari_lingkaran, luas_kolam_persegi;
        double phi = 3.14, luas_kolam_lingkaran, luas_total_kolam, luas_tanah_rumput;

        System.out.println("Masukkan panjang tanah: ");
        panjang_tanah = sc.nextInt();
        System.out.println("Maasukkan lebar tanah: ");
        lebar_tanah = sc.nextInt();
        System.out.println("Masukkan diameter kolam lingkaran: ");
        diameter_lingkaran = sc.nextInt();
        System.out.println("Masukkan sisi kolam persegi: ");
        panjang_sisi_persegi = sc.nextInt();

        luas_tanah = panjang_tanah * lebar_tanah;
        jari_jari_lingkaran = diameter_lingkaran / 2;
        luas_kolam_lingkaran = phi * jari_jari_lingkaran * jari_jari_lingkaran;
        luas_kolam_persegi = panjang_sisi_persegi * panjang_sisi_persegi;
        luas_total_kolam = luas_kolam_lingkaran + luas_kolam_persegi;
        luas_tanah_rumput= luas_tanah - luas_total_kolam;

        System.out.println("Luas tanah: "+ luas_tanah);
        System.out.println("Luas kolam lingkaran: "+ luas_kolam_lingkaran);
        System.out.println("Luas kolam persegi: "+ luas_kolam_persegi);
        System.out.println("Luas total  kolam: "+ luas_total_kolam);
        System.out.println("Luas tanah yang ditanami rumput: " + luas_tanah_rumput);
    }
}