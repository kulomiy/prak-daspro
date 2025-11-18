public class ContohVariabel17 {
    public static void main(String[] args) {
        String hobi = "menggambar";
        boolean pandai = true;
        char gender = 'P';
        byte umur = 18;
        double ipk = 4.00, tinggiBadan = 1.52;
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis kelamin: " + gender);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggiBadan));
    }
}
