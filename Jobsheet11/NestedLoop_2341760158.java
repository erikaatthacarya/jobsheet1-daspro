import java.util.Scanner;

public class NestedLoop_2341760158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Hari ke-" + (j + 1) + ": ");
            temps[i][j] = sc.nextDouble();
            }
            System.out.println();
            }
        int kota = 1; 
        for (double[] baris : temps) { 
            System.out.print("Kota ke-" + kota + ": ");
            double total = 0; 
            for (double suhu : baris) { 
            System.out.print(suhu + " ");
            total += suhu; 
            }
            double rata = total / baris.length; 
            System.out.println();
            System.out.println("Nilai rata-rata kota ke-" + kota + " adalah: " + rata); 
            kota++; 
        }
    }
}