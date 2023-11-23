import java.util.Scanner;

public class Ucapan_09 {
    public static void PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        System.out.println("hallo ini statement tambahan");
        System.out.println("Thank you " + namaOrang + ", May the force be with you.");
    }
    public static void main(String[] args) {
        PenerimaUcapan();
    }
}
