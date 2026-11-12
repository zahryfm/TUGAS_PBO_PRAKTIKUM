import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan : ");
        int banyak = in.nextInt();
        double total = 0;
        for (int i = 1; i <= banyak; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            total += in.nextDouble();
        }
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + (total / banyak));
    }
}
