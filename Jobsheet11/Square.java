import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Masukkan nilai N =");
       int N = sc.nextInt();
        for (int iOuter=1; iOuter<=N; iOuter++) { //perulangan luar
            for (int i = 1; i <=N; i++) { //perulangan dalam 
                System.out.print("*");
            }    
        System.out.println();
        }
    }
}
