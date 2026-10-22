package tugas_3_praktikum;
import java.io.DataInputStream;
import java.io.IOException;

public class HitungBelanja {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);

        try {
            System.out.print("Masukkan Nama        : ");
            String nama = dis.readLine();

            System.out.print("Masukkan Total Belanja : ");
            double totalBelanja = Double.parseDouble(dis.readLine());

            System.out.print("Masukkan Diskon (%)  : ");
            double diskonPersen = Double.parseDouble(dis.readLine());

            double diskon = (diskonPersen / 100) * totalBelanja;
            double total = totalBelanja - diskon;

            System.out.print("Masukkan Bayar       : ");
            double bayar = Double.parseDouble(dis.readLine());

            double kembalian = bayar - total;

            System.out.println("\n--- STRUK PEMBELANJAAN ---");
            System.out.println("Nama        : " + nama);
            System.out.println("Total Belanja : " + totalBelanja);
            System.out.println("Diskon      : " + diskon);
            System.out.println("Total       : " + total);
            System.out.println("Bayar       : " + bayar);
            System.out.println("Kembalian   : " + kembalian);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input.");
        }
    }
}

