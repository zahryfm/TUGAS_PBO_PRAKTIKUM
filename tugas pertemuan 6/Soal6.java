import java.util.InputMismatchException;
import java.util.Scanner;


public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        // Input jumlah bilangan (ulangi sampai valid)
        while (true) {
            try {
                System.out.print("Masukkan jumlah bilangan: ");
                n = input.nextInt();
                if (n <= 0) {
                    System.out.println("Jumlah harus lebih dari 0!");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: input harus berupa bilangan bulat!");
                input.nextLine(); // bersihkan buffer
            }
        }

        double total = 0;
        int i = 0;
        while (i < n) {
            try {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                double angka = input.nextDouble();
                total += angka;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: yang Anda masukkan bukan bilangan! Silakan ulangi.");
                input.nextLine(); // bersihkan buffer
            }
        }

        System.out.println("\nJumlah     : " + total);
        System.out.println("Rata-rata  : " + (total / n));

        input.close();
    }
}
