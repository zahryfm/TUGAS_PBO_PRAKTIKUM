import java.util.Scanner;


public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine(); // buang sisa enter

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine();

            status[i] = (nilai[i] <= 50) ? "Tidak Lulus" : "Lulus";
        }

        System.out.println("\n               Daftar Nilai Mahasiswa");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-5s %-20s %-8s %-12s%n", "No", "Nama", "Nilai", "Status");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-20s %-8d %-12s%n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("---------------------------------------------------");

        input.close();
    }
}
