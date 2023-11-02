import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = scan.nextLine();
            System.out.print("Masukkan baris: ");
            baris = scan.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = scan.nextInt();
            scan.nextLine(); //agar kita bisa memasukkan isi diatas 

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): "); //(y/n=yes/no)
            next = scan.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
