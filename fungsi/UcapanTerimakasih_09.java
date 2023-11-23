import java.util.Scanner;

public class UcapanTerimakasih_09 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nTuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
        UcapanTambahan();
    }
    public static void UcapanTambahan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan ucapan tambahan : ");
        String ucapanTambahan = sc.nextLine();
        System.out.print("Additional message : " + ucapanTambahan);
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}