import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu='y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka(1-10):");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer==number);
                if (!success) {
                    if (answer < number) {
                        System.out.println("Tebakan anda terlalu kecil.");
                    }else {
                        System.out.println("Tebakan anda terlalu besar.");
                    }
                }else{
                    System.out.println("Selamat! anda menebak dengan benar.");
                }
            } while (!success);
            System.out.println("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.next().charAt(0);
        } while (menu=='y' || menu=='Y');
    }
}
