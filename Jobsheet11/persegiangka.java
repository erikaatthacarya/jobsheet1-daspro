import java.util.Scanner;

public class persegiangka {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3");
        } else {
            for (int i = 0; i < N; i++) {
                System.out.print(N + " ");
            }
            System.out.println();

            for (int i = 0; i < N - 2; i++) {
                System.out.print(N + " "); // Cetak angka pertama
                for (int j = 0; j < N - 2; j++) {
                    System.out.print("  "); // Cetak spasi
                }
                System.out.print(N + " "); // Cetak angka terakhir
                System.out.println();
            }

            for (int i = 0; i < N; i++) {
                System.out.print(N + " ");
            }
            System.out.println();
        }
    }
}

