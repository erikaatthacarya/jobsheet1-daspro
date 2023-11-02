import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baris, kolom;
        int option;
        int n = 4;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            option = scan.nextInt();
            
            if (option == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.println("Masukkan nama penonton ke-" + (i + 1) + ": ");
                    nama = scan.next();
                }
                System.out.println("Data penonton telah diinput.");
            } else if (option == 2 ) {
                System.out.println("Daftar Penonton: ");
                for (int i = 0; i < n; i++) {
                    System.out.println("Penonton ke-" + (i + 1) + ": " + penonton[i]);
                }
            } else if (option ==3) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid. Silhkan pilih menu yang sesuai");
            }
            System.out.print("Masukkan nama: ");
            nama = scan.next();
            System.out.print("Masukkan baris: ");
            baris = scan.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = scan.nextInt();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): "); //(y/n=yes/no)
            next = scan.next();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
